package object;

import java.util.ArrayList;
import java.util.List;

public class patternList {
    public static void main(String[] args) {
        List list = new ArrayList();
        String str = "1+2";
        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i,i+1));
        }
        System.out.println(list);

        String strNum = "";
        for (int i = 0; i < list.size(); i++) {

            int c = 1;
            switch (c){
                case 1:
                    System.out.println(" is athis add method");
                    try {
                        strNum = strNum + Integer.parseInt((String) list.get(i));
                        int num = Integer.parseInt(strNum);
                        System.out.println(num);
                    }catch (Exception e){
                        System.out.println("you nene get agin");
                    }
                case 2:
                    System.out.println("this is a sub jianfa");
                case 3:
                    System.out.println("this is a x yunsuan");
            }
        }
    }
}
