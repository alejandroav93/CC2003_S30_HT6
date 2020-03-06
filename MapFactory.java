import java.util.*;

class MapFactory<E>
{
    public Map<E,E> getMap(String tipo)
    {
        Map<E,E> mapa=null;
        switch(tipo)
        {
            case "HashMap": mapa= new HashMap<E, E>(); break;
            case "TreeMap": mapa= new TreeMap<E, E>(); break;
            case "LinkedHashMap": mapa= new LinkedHashMap<E, E>(); break;
            default: mapa= new HashMap<E, E>(); break;
        }
        return mapa;
    }
}