import java.util.ArrayList;
class ArraylistEx{
    public static void main(String args[]){
        ArrayList<String> list= new ArrayList<String>();
        list.add("Kane");
        list.add("Messi");
        list.add("Nani");
        list.add("Ronaldo");
        System.out.println(list);
        list.set(2,"India");
        for (int i = 0; i < list.size(); i++) {
        if (list.get(i).equals("India")) {
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