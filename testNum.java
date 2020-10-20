import java.lang.reflect.Array;
import java.util.ArrayList;

public class testNum {
    private static int NumberTest = 1;

    public static void main(String[] args) {
        String s = "1+2";
        ArrayList<String> arr = testInt(s);
        System.out.println(arr);
        testparseInt(arr);
    }

    public static ArrayList<String> testInt(String str){
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            String substring = str.substring(i,i+1);
            try {
                switch (substring){
                    case "+":
                        NumberTest = 1;
                        break;
                    case "-":
                        NumberTest = 1;
                        break;
                    case "*":
                        NumberTest = 1;
                        break;
                    case "/":
                        NumberTest = 1;
                        break;
                    default:
                        arrayList.add(substring);
                        break;
                }
            }catch (Exception e){
                System.out.println("添加不成功");
            }
        }
        return arrayList;
    }

    public static void testparseInt(ArrayList<String> s){
        int aaa = 0;
        for (String value:s
             ) {
            int anInt = Integer.parseInt(value);
            if(NumberTest==1){
                System.out.println("这是加法");
                aaa+=anInt;
            }else if(NumberTest==2){
                System.out.println("这是减法");
                aaa-=anInt;
            }else if(NumberTest==3){
                System.out.println("这是乘法");
                aaa*=anInt;
            }else if (NumberTest==4){
                System.out.println("这是除法");
                aaa/=anInt;
            }
        }
        System.out.println(aaa);
    }
}
