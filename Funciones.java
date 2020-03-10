import java.util.*;
/*import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class Funciones
{
    /**
     *THIS METHOD READS THE .TXT FILE TO BE SEPARATED BY LINES IN ORDER FOR THE DATA TO BE SAVED IN THE STRUCTURE
     * @return
     */
    public Map<String, String> PrepareCards() throws Exception
    {
        MapFactory<String> mapFactory= new MapFactory<String>();
        String tipo=PedirTipoDeImplementacion();
        Map<String, String> mapa = mapFactory.getMap(tipo); 
        BufferedReader br = new BufferedReader(new FileReader("cards_desc.txt"));
        String line; 
        while ((line = br.readLine()) != null) 
        {
             String[] par= line.split("\\|");
            mapa.put(par[0], par[1]);
        }
        /*Set< Map.Entry< String,String> > st = mapa.entrySet();    
        //System.out.println("Hola");
       for (Map.Entry< String,String> me:st) 
       { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } */
       //System.out.println(mapa.size()+""); 
       br.close();

        return mapa;
    }

    String PedirTipoDeImplementacion()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione un tipo de Map:");
        System.out.println("1)HashMap\n2)TreeMap\n3)LinkedHashMap");
        String tipo="";
        int opcion= scan.nextInt();
        switch(opcion)
        {
            case 1: tipo="HashMap"; break;
            case 2: tipo="TreeMap"; break;
            case 3: tipo="LinkedHashMap"; break;
            default: tipo="HashMap"; break;
        }
        return tipo;
    }

}