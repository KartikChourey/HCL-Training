import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        HashMap<Integer,String> map2=new HashMap<>(10);
        HashMap<Integer,String> map3=new HashMap<>(map1);

        map1.put(1,"Java");
        map1.put(2,"Python");
        map1.put(3,"C++");

        System.out.println(map1.get(2));
        System.out.println(map1.containsKey(1));
        System.out.println(map1.containsValue("Java"));
        System.out.println(map1.size());

        map1.remove(3);
        System.out.println(map1.isEmpty());
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        for(Map.Entry<Integer,String> e:map1.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        map1.putIfAbsent(4,"HTML");
        map1.replace(2,"CSS");
        System.out.println(map1.getOrDefault(5,"Not Found"));

        HashMap<Integer,String> clone=(HashMap<Integer,String>)map1.clone();
        map3.clear();
    }
}
