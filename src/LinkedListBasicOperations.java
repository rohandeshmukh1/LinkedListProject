import java.util.LinkedList;
 
public class LinkedListBasicOperations {
 
    public static void main(String a[]){
        //a linked list maintains the order of the items
        //you can add an item to a particular position by using the index
        //you can also use the index to remove items        
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? " + ll.contains("Grape"));
        
        //add at a particular position
        ll.add(3, "Coconuts");
        System.out.println(ll);
        System.out.println("The first element is: " + ll.getFirst());
        System.out.println("The last element is: " + ll.getLast());
        ll.removeFirst();
        System.out.println(ll);
        //another way to print
        printList(ll);
        
        //Change Grape to Mango
        System.out.println("Index of Grape: " + ll.indexOf("Grape"));
        //update the item at index 1 from Grape to Mango
        //ll.set(1,"Mango");
        //But a better way is to get the index and pass it directly to our set method
        ll.set(ll.indexOf("Grape"),"Mango");
        printList(ll);
        
        //use a StringBuilder to create a CSV delimited list
        String csv = getListAsCsvString(ll,'|');
        System.out.println(csv);
        
    }
    private static void printList(LinkedList<String> ll){
        for (String item: ll){
            System.out.println(item);
        }
    }
    public static String getListAsCsvString(LinkedList<String> list, char delim){
        
        StringBuilder sb = new StringBuilder();
        for(String str:list){
            if(sb.length() != 0){
                sb.append(delim);
            }
            sb.append(str);
        }
        return sb.toString();
    }
    
}