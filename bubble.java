public class bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{9,6,7,4,5,3,1,4,35,23,53,45,3,343};
        int[] test = test(arr);
        for (int value:test
             ) {
            System.out.println(value);
        }
    }

    public static int[] test(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {
                if(arr[j+1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }return arr;
    }
}
