package course;
import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
//        for(String str:list){
//            System.out.println(str);
//        }

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        String[] strArray = new String[list.size()];

        list.toArray(strArray);
        for (int  i=0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }




    }
}
