public class Demo4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
                break;
            arr[i] = arr[i] + 10;
        }
        for (int i:arr
             ) {
            System.out.println(i);
        }
        // 死循环  while(true) while (1>0)

    }
}
