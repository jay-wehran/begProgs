import java.util.Arrays;

public class SelectSort{

    public static void main (String[] args) {
        int [] numbers = new int[10];
        for (int i = 0; i<numbers.length-1;i++){
            numbers[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(numbers));
        //selection sort code:


        for (int i = 0; i < numbers.length - 1; i++);
        int indexMin = i;
        int min = numbers[i];
        for (int j = i + 1; j < numbers.length; j++){
            if (min > numbers[j]) {
                min = numbers[j];
                indexMin = j;
            }
        }
        if (indexMin != i) {
            numbers[indexMin] = numbers[i];
            numbers[i] = min;
        }

        System.out.println(Arrays.toString(numbers));


        // insertion sort code

        int insertElement;
        for (int i = 1; i < numbers.length; i++){
            insertElement = numbers[i];
            int j = i -1;
            while (j >=0){
                if (numbers[j]>insertElement){
                    numbers[j+1] = numbers[j--];
                } else {
                    break;
                }
            }
            numbers[j + 1] = insertElement;
        }
        System.out.println(Arrays.toString(numbers));

    }
}