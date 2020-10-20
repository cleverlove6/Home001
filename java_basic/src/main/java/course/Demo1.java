public class Demo1 {
    public static void main(String[] args) {
        int i = 1;
        /*
        * 执行过程
        * Integer i= Integer.valueOf(1024);
        *需要县创建对象
        * Integer i; 默认的值是null
        * */
        System.out.println(i);

        int[] arr = new int[10]; // 10空间大小的数组，默认值是0
        int[] arr1 = new int[]{1,2,3,4,5,6};
        long[] larr = new long[10];
        Integer[] iarr = new Integer[10];

        //数组越界的问题
        System.out.println(arr[0]+arr[0]);
        //超过了最大的数组界限。
        System.out.println(arr[10]);

        int count = counter2(1,2,"-");
        System.out.println(count);
    }

    public static int counter2(int i1,int i2,String operator){
        switch (operator){
            case "+":
                return i1+i2;
            case "-":
                return i1-i2;
            default:
                System.out.println("hava not thie support");
        }

        return 0;
    }
}
