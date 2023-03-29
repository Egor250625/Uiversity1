import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Egor");
        int size = list.size();
        System.out.println(size);
        String s = list.get(0);
        //System.out.println(s);
       //list.remove(0);
       //int size1 = list.size();
       //System.out.println(size1);
        for ( String element   : list   ) {
            System.out.println(element);

        }
    }
}
