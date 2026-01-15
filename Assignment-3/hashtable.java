import java.util.Hashtable;
import java.util.Enumeration;

public class Hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1=new Hashtable<>();
        Hashtable<Integer,String> ht2=new Hashtable<>(10);
        Hashtable<Integer,String> ht3=new Hashtable<>(ht1);

        ht1.put(1,"Java");
        ht1.put(2,"Python");

        System.out.println(ht1.get(1));
        System.out.println(ht1.containsKey(2));
        System.out.println(ht1.containsValue("Java"));
        System.out.println(ht1.size());

        ht1.remove(2);
        System.out.println(ht1.isEmpty());

        Enumeration<Integer> keys=ht1.keys();
        while(keys.hasMoreElements()){
            System.out.println(keys.nextElement());
        }

        Enumeration<String> values=ht1.elements();
        while(values.hasMoreElements()){
            System.out.println(values.nextElement());
        }

        ht1.putIfAbsent(3,"C++");
        ht1.replace(1,"HTML");
        System.out.println(ht1.getOrDefault(4,"Not Available"));

        Hashtable<Integer,String> clone=(Hashtable<Integer,String>)ht1.clone();
        ht3.clear();
    }
}
