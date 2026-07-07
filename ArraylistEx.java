import java.util.ArrayList;
class ArraylistEx{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(20);
        list.add(90);
        list.add(30);
        for(int n: list){
            System.out.println(n);
        }
        System.out.println(list);
    }
}