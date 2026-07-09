import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addLast(100);
        list.addFirst(90);
        System.out.println(list.peekLast());
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
