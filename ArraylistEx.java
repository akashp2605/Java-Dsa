import java.util.ArrayList;
class ArraylistEx{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(20);
        list.add(90);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.set(2,100 );
       for (int i = 0; i < list.size(); i++) {
    if (list.get(i) == 40) {
        System.out.println("Found");
        return;
    }
}

System.out.println("Not Found");
        System.out.println(list);
    //     for(int n: list){
    //         System.out.println(n);
    //     }
    //     System.out.println(list);
 }
}