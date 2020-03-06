import java.util.*;
/*import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;*/
import java.io.BufferedReader;
import java.io.FileReader;

class Funciones
{
    /**
     *THIS METHOD READS THE .TXT FILE TO BE SEPARATED BY LINES IN ORDER FOR THE DATA TO BE SAVED IN THE STRUCTURE
     * @return
     */
    public Map<String, String> PrepareCards() throws Exception
    {
        Map<String, String> mapa = SelectMap();
        BufferedReader br = new BufferedReader(new FileReader("cards_desc.txt"));
        String line; 
        while ((line = br.readLine()) != null) 
        {
             //= new String[2];
             String[] par= line.split("\\|");
            mapa.put(par[0], par[1]);
        }
        Set< Map.Entry< String,String> > st = mapa.entrySet();    
        //System.out.println("Hola");

       for (Map.Entry< String,String> me:st) 
       { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
       br.close();

        return mapa;
    }

    Map<String, String> SelectMap() throws Exception
    {
        return new HashMap<String, String>();
    }
}