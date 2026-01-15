import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();
        Vector<Integer> v2=new Vector<>(5);
        Vector<Integer> v3=new Vector<>(5,2);

        v1.add(10);
        v1.add(20);
        v1.addElement(30);

        System.out.println(v1.size());
        System.out.println(v1.capacity());
        System.out.println(v1.get(1));

        v1.set(1,25);
        System.out.println(v1.contains(10));

        v1.remove(0);
        System.out.println(v1.isEmpty());
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());

        Enumeration<Integer> e=v1.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        Vector<Integer> clone=(Vector<Integer>)v1.clone();
        v3.clear();

        Object[] arr=v1.toArray();
        System.out.println(arr.length);
    }
}
