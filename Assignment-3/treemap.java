import java.util.TreeMap;
import java.util.Map;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm1=new TreeMap<>();
        TreeMap<Integer,String> tm2=new TreeMap<>(tm1);

        tm1.put(3,"C++");
        tm1.put(1,"Java");
        tm1.put(2,"Python");

        System.out.println(tm1.get(1));
        System.out.println(tm1.firstKey());
        System.out.println(tm1.lastKey());
        System.out.println(tm1.containsKey(2));
        System.out.println(tm1.size());

        tm1.remove(3);
        System.out.println(tm1.keySet());
        System.out.println(tm1.values());

        for(Map.Entry<Integer,String> e:tm1.entrySet()){
            System.out.println(e);
        }

        System.out.println(tm1.higherKey(1));
        System.out.println(tm1.lowerKey(2));
        System.out.println(tm1.ceilingKey(2));
        System.out.println(tm1.floorKey(2));

        tm2.clear();
    }
}
