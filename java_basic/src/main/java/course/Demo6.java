public class Demo6 {
    public static void main(String[] args) {
        if(chk1()||chk2()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static boolean chk1(){
        System.out.println("chk1");
        return true;
    }

    public static boolean chk2(){
        System.out.println("chk2");
        return false;
    }
}
