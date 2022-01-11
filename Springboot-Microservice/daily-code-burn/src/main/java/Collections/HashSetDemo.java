package Collections;

import java.util.*;
public class HashSetDemo {
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();
  
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add(null);
        hs.add(null);
        hs.add("Very helpful");
  
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        System.out.println("Hashset no order");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
     // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs
            = new LinkedHashSet<String>();
  
        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");
        System.out.println("LinkedHashset maintains order, uses doubly linked list");
        // Traversing elements
        Iterator<String> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        
     // Creating TreeSet and
        // adding elements
        TreeSet<String> ts
            = new TreeSet<String>();
  
        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");
        System.out.println("SortedSet is implemented by Treeset");
        // Traversing elements
        Iterator<String> itc = ts.iterator();
        while (itc.hasNext()) {
            System.out.println(itc.next());
        }
    }
}