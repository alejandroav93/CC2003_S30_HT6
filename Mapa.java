import java.util.HashMap;
import java.util.Map;

public interface Mapa<K, V>
{
//NTC stands for name, type and quantity.
//ordered means ordered by type. 
    V put(K key, V value);
    V get(Object key);
    void showNTQ(Map<K,V> map);
    void showOrderedNTQ(Map<K,V> map);
    void showNT(Map<K,V> map);
    void showOrderedNT(Map<K,V> map);

}