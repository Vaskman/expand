import java.util.Arrays;

public class Main {
        public static void invert(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
        public static void main(String[] args) {
            int []arr={1,2,3};
            invert(arr);
        }


}