public class Demo5 {
    public static void main(String[] args) {
        Integer i = 1024;
        if(i.equals(1024))
            System.out.println(i);
    }

    public static void test(int i1,int i2){
        if(i1>1024&&i2<2048){
            // 判断结果
            // 两个必须都为true结果才是true
        }else if(i1>2048||i2>4096){
            // 满足一个就为true
            // 两个钟有一个是true就是true
        } else if (!(i1>i2)){
            //  如果i1>i2为true，去反就是false
        }
    }

    public static String getInfo(String info){
        return null==info||info.length()==0?"null":info;
    }
}
