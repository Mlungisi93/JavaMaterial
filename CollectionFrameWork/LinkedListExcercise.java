package CollectionFrameWork;
import java.util.*;
public class LinkedListExcercise {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int number;
 LinkedList<Integer> myLinkedList = new LinkedList<>();
 myLinkedList.add(1);
 myLinkedList.add(4);
        myLinkedList.add(3);


        System.out.println("List Elements");
 System.out.println(myLinkedList);

        Collections.shuffle(myLinkedList);
        System.out.println("Shuffled LinkedList Elements");
        System.out.println(myLinkedList);

        Collections.sort(myLinkedList);
        System.out.println("Sorted LinkedList Elements");
        System.out.println(myLinkedList);

        //create list
        LinkedList<Integer> anotherMyLinkedList = new LinkedList<>();
        anotherMyLinkedList.addAll(myLinkedList);
        //List<Integer> a =  Collections.unmodifiableList(anotherMyLinkedList);
       // a.add(100); error
        //System.out.println("Another List Elements");
        //System.out.println(a);

        Iterator i = myLinkedList.iterator();

        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }

        Iterator a = myLinkedList.descendingIterator();
        System.out.println("Descending");

        while(a.hasNext())
        {
            System.out.print(a.next() +" ");
        }
        System.out.println("For Each");

        for (Integer t: myLinkedList)
        {
            System.out.print(t+" ");
        }

        myLinkedList.remove(2);
        System.out.println("Removed");
        System.out.println(myLinkedList);
        myLinkedList.add(0, 100);
        System.out.println("Added");
        System.out.println(myLinkedList);

        myLinkedList.addFirst(20);
        System.out.println("Add 20 Using AddFirst Method");
        System.out.println(myLinkedList);
        myLinkedList.removeLast();
        System.out.println("Remove 3 Using RemoveLast Method");
        System.out.println(myLinkedList);
        System.out.println("Indexes");
        System.out.println(myLinkedList.indexOf(100));

        int z = myLinkedList.poll();
        System.out.println("List after removing first element");
        System.out.println(myLinkedList);
        System.out.println("Element removed is "+z);

        for (int j = 0; j < myLinkedList.size(); j++) {
            System.out.println("index " + j+" Element "+myLinkedList.get(j));
        }

        System.out.println(fab(7)) ;
    }

    public static int fab(int n)
    {
        if(n <= 1)
        {
            return n;
        }else
        {
            return fab(n-1) + fab(n -2);
        }
    }
}
