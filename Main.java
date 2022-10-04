import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 8, 11, 14, 30};
        String[] strarray = new String[]{"Omar", "Zeyad", "Karim", "Ahmed"};

        //get the average of integer array
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        int average = total / array.length;
        System.out.println("average number is : " + average);

        //get largest and smallest value of integer array
        int smallest = array[0];
        int biggest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest)
                biggest = array[i];
            else if (array[i] < smallest)
                smallest = array[i];

        }

        System.out.println("Largest Number is : " + biggest);
        System.out.println("Smallest Number is : " + smallest);

        //Reverse the int array
        for (int i = array.length -1, j=0 ; j<i ; i--,j++) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));


        //sort the both string and integer array
        for (int i = 0; i < strarray.length -1; i++) {
            for (int j = i+1; j < strarray.length; j++) {

                if (strarray[i].compareToIgnoreCase(strarray[j]) >0){
                    String temp = strarray[j];
                    strarray[j] = strarray[i];
                    strarray[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(strarray));
    }
    }

