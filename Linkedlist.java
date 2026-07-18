import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addLast(1000);
        list.addFirst(900);
        System.out.println(list.peekLast());
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
