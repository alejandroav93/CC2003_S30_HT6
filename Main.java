import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Funciones f = new Funciones();
        try
        {
            Map<String,String> map=f.PrepareCards();
            Deck deck = new Deck(map);

            int opcion=0;
            Scanner scan= new Scanner(System.in);

            while (opcion!=7)
            {
                System.out.println("Seleccione una opcion:\n1)Agregar carta\n2)Mostrar tipo de carta especifica\n3)Mostrar tipo y cantidad de carta en coleccion\n4)Mostrar tipo y cantidad de carta en coleccion ordenadas por tipo\n5)Mostrar nombre y tipo de todas las cartas existentes\n6)Mostrar nombre y tipo de todas las cartas existentes ordenadas por tipo\n7)Salir");
                opcion = scan.nextInt();
                    String nombre;
                    switch(opcion)
                    {
                        case 1:
                        {
                            System.out.println("Ingrese el nombre de la carta deseada:"); 
                            nombre= scan.nextLine();
                            nombre= scan.nextLine();
                            deck.put(nombre);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Ingrese el nombre de la carta deseada:"); 
                            nombre= scan.nextLine();
                            nombre= scan.nextLine();
                            deck.showCard(nombre);
                            break;
                        }
                        case 3:
                        {
                            deck.printDeck();
                            break;
                        }
                        case 4:
                        {
                            deck.printOrderedDeck();
                            break;
                        }
                        case 5:
                        {
                            deck.printMap();
                            break;
                        }
                        case 6:
                        {
                            deck.printOrderedMap();
                            break;
                        }
                        default: break;
                    }

                    System.out.println(" ");
                    /*deck.put("Madolche Butlerusk");
                    deck.put("Madolche Hootcake");
                    deck.put("Madolche Butlerusk");
                    deck.put("Madolche Butlerusk");
                    deck.put("Macro Cosmos");
                    deck.put("Machine Duplication");
                    deck.printOrderedDeck();
                    deck.printDeck();*/
                
            }

        }
        catch(Exception e)
        {

        }
        
        
        
    }
}