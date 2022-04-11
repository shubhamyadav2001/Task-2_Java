import java.util.ArrayList;

public class Program9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Ram");
        list.add("Sam");
        list.add("Menna");
        list.add("Venna");
        list.add("Tenna");
        list.add("Renna");

        System.out.println("Size of list : "+list.size());
        for(String name : list) {
            System.out.println("Name is : "+name);
        }

        System.out.println("\nAfter removing the element");
        list.remove(5);
        System.out.println("Size of list : "+list.size());
        for(String name : list) {
            System.out.println("Name is : "+name);
        }
    }

}
