package collection;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class CollectionMain {


    /** This class shows how to sort primitive arrays,
     * Wrapper classes Object Arrays
     * @param args
     */
    public static void main(String[] args) {

    	//List extends collections, arraylist, linkedlist, vector and stack are children
    	//extends Collection<E> 
    	ArrayList<String> strigList = new ArrayList<String>();
    	
    	
    	//extends AbstractSequentialList<E> //linkedList implements List<E>, Deque<E>, Cloneable, java.io.Serializable
    	LinkedList<String> linkedList = new LinkedList<String>(); 
    	
    	
    	//extends AbstractList<E> //vector implements List<E>, RandomAccess, Cloneable, java.io.Serializable
    	Vector<String> vectorStr = new Vector<String>(); 
    	
    	//extends Vector<E>
    	Stack<String> stackStr = new Stack<String>(); 
    	
    	
    	//Set
    	//extends Collection<E>
    	Set<String> strSet = new HashSet<String>();
    	
    	LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
    	
    	HashSet<String> hashSet = new HashSet<String>();
    	
    	
    	SortedSet<String> sortedSet = new TreeSet<String>();
    	
    	
    	TreeSet<String> treeSet = new TreeSet<String>();
    	
    	//Map
    	Map<String,String> mapStr = new HashMap<String,String>();
    	
    	SortedMap<String,String> sortedMap = new TreeMap<String,String>();
    	
    	
    	NavigableMap<String,String> navigableMapStr = new TreeMap<String,String>();
    	
    	TreeMap<String,String> treeMapStr = new TreeMap<String,String>();
    	
    	
    	//Queue
    	Queue<String> queue = new PriorityQueue<String>();
    	
    	//Deque
    	Deque<String> dequeue = new ArrayDeque<String>(); 
    	
    	
    	
    	/////////////////////////////////
    	ConcurrentHashMap<String,String> concurrentHash = new ConcurrentHashMap<>();
    	
    	

    }
}
