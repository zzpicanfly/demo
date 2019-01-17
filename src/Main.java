import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Integer i = 1;
        Integer i1 = 3;
        Integer i2 = 4;
        Integer i3 = 6;
        intList.add(i1);
        intList.add(i);
        intList.add(i2);
        intList.add(i3);
        for(Integer ii : intList){
            System.out.println(ii);
        }
        System.out.println("-------------------------------");
        Set<Integer> set = new  HashSet(intList);
        for(Integer g:set){
            System.out.println(g);
        }


    }
}
