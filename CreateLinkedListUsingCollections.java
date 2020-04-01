import java.util.*;
public class CreateLinkedListUsingCollections {
public static void main(String args[]){

LinkedList<String> object=new LinkedList<String>();
object.add("A");
object.add("B");
object.add("C");
object.add("D");
object.add(2,"E");
object.addLast("G");
object.addFirst("H");
System.out.println("Linked List: "+object);
object.remove("B"); 
        object.remove(3); 
        object.removeFirst(); 
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
boolean status=object.contains("B");
if(status){
System.out.println("The linked list contains B");
}
else{
System.out.println("The linked list does not contain B");
}

int size=object.size();
System.out.println("The size of the linked list is: "+size);



Object element=object.get(2);
System.out.println("The element returned by get() method is: "+element);
object.set(2,"Y");
System.out.println("The linked list after change: "+object );


}    
}
