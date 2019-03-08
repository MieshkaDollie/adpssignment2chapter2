package ac.za.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public LinkedList<String> collection (){

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("list1");
        linkedList.add("list2");
        linkedList.add("list3");
        linkedList.add("likst4");
        Iterator<String> iterator = linkedList.iterator();

        System.out.println("Linkedlist with 4 items");
        System.out.println(linkedList);

        return linkedList;
    }


    public Set<Integer> set(){

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        return intersection;
    }


    public int list(){

        List<String> list = new ArrayList<String>();

        list.add("list1");
        list.add("list2");
        System.out.println("List of two items");
        System.out.println(list);
        return list.size();



    }


    public Map<String,Integer> map(){

        Map< String,Integer> m =
                new HashMap< String,Integer>();
        m.put("a", 7);
        m.put("b", 6);

        System.out.println("Map with two items");
        System.out.println(m);
        return m;
    }

}

