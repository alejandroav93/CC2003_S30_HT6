import java.util.AbstractMap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class HashMapa<K, V> extends AbstractMap<K, V> implements Mapa<K, V> {

    HashMap<K,V> map=null;

    HashMapa(HashMap<K,V> mapa){
        map=mapa;
    }

    @Override
    public V put(K key, V value) {
        map.put(key, value);
        return value;
    }

    @Override
    public V get(Object key) {
        return map.get(key);
    }

    @Override
    public void showNTQ(Map<K, V> map) {
        Set<K> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        for (int i = 0; i < map.size(); i++) 
        {
            System.out.println("Name: "+keysArray[i]+". Type: "+map.get(keysArray[i])+". Quantity: 1");//falta poner cantidad
            i++;
        }
    }

    @Override
    public void showOrderedNTQ(Map<K,V> map) {
        Set<K> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        System.out.println(map.get(keysArray[0]));
        System.out.println("CARTAS TIPO MONSTRUO:");
        for (int i = 0; i < map.size(); i++)
        {
            if(map.get(keysArray[i])=="Monstruo"){
            System.out.println("Name: "+keysArray[i]+". Type: "+map.get(keysArray[i])+". Quantity= ");//falta agregar cantidad
            }
        }
        System.out.println("CARTAS TIPO HECHIZO:");
        for (int i = 0; i < map.size(); i++)
        {
            if(keysArray[i]=="Hechizo"){
            System.out.println("Name: "+keysArray[i]+". Type: "+map.get(keysArray[i])+". Quantity= ");//falta agregar cantidad
            }
        }
        System.out.println("CARTAS TIPO TRAMPA:");
        for (int i = 0; i < map.size(); i++)
        {
            if(keysArray[i]=="Trampa"){
            System.out.println("Name: "+keysArray[i]+". Type: "+map.get(keysArray[i])+". Quantity= ");//falta agregar cantidad
            }
        }

    }

    @Override
    public void showNT(Map<K,V> map) {
        Set<K> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        for (int i = 0; i < map.size(); i++) 
        {
            System.out.println("Name: "+keysArray[i]+". Type: "+map.get(keysArray[i]));//falta poner cantidad
            i++;
        }

    }

    @Override
    public void showOrderedNT(Map<K,V> map) {
        Set<K> keysList=map.keySet();
        Object[] keysArray=keysList.toArray();
        System.out.println("CARTAS TIPO MONSTRUO:");
        for (int i = 0; i < map.size(); i++)
        {
            if(keysArray[i]=="Monstruo"){
            System.out.println("Type: "+keysArray[i]+". Name: "+map.get(keysArray[i])+". Quantity= ");//falta agregar cantidad
            }
        }
        System.out.println("CARTAS TIPO HECHIZO:");
        for (int i = 0; i < map.size(); i++)
        {
            if(keysArray[i]=="Hechizo"){
            System.out.println("Type: "+keysArray[i]+". Name: "+map.get(keysArray[i])+". Quantity= ");//falta agregar cantidad
            }
        }
        System.out.println("CARTAS TIPO TRAMPA:");
        for (int i = 0; i < map.size(); i++)
        {

            if(keysArray[i]=="Trampa"){
            System.out.println("Type: "+keysArray[i]+". Name: "+map.get(keysArray[i])+". Quantity= ");//falta agregar cantidad
            }
        }


    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        // TODO Auto-generated method stub
        return null;
    }
    
}