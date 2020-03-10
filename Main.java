import java.util.HashMap;
import java.util.Map;

class Main
{
    public static void main(String[] args)
    {
        Funciones f = new Funciones();
        try
        {
            Map<String,String> map=f.PrepareCards();
            Deck deck= new Deck(map);
            deck.put("Madolche Butlerusk");
            deck.put("Madolche Hootcake");
            deck.put("Madolche Butlerusk");
            deck.put("Madolche Butlerusk");
            deck.put("Randy");
            deck.printDeck();
        }
        catch(Exception e)
        {
            
        }
    }
}