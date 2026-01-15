import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>(5);
        ArrayList<String> list3=new ArrayList<>(list1);

        list1.add("Java");
        list1.add("Python");
        list1.add("C++");
        list1.add(1,"HTML");

        System.out.println(list1.size());
        System.out.println(list1.get(2));

        list1.set(2,"CSS");
        System.out.println(list1.contains("Java"));

        list1.remove("CSS");
        System.out.println(list1.isEmpty());

        Iterator<String> it=list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        list2.addAll(list1);
        System.out.println(list1.indexOf("Java"));

        list1.add("Java");
        System.out.println(list1.lastIndexOf("Java"));

        Collections.sort(list1);
        list3.clear();

        Object[] arr=list1.toArray();
        System.out.println(arr.length);
    }
}
