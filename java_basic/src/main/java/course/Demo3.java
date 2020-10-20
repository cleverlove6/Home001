public class Demo3 {


    public static int sum(int i,int j){
        if(i<0){
            System.out.println("count sum i shold");
            return -1;
        }else if(i>5){
            System.err.println("i不能大于5");
            return -1;
        }

        return i+j;
    }

    public static int counter(int i1,int i2,String operator){
        if(operator.equals("+")){
            return i1+i2;
        }else if(operator.equals("-")){
            return i1-i2;
        }else if(operator.equals("*")){
            return i1*i2;
        }else{
            System.err.println("Demo3 operator havae not this support");
        }
        return 0;
    }
    public static void main(String[] args) {
        int result = sum(6,2);
        System.out.println(result);

        int counter = counter(1,2,"+");
        System.out.println(counter);
    }
}
