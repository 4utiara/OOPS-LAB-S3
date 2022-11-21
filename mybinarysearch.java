/ Bubble sort in Java
import java.util.*;
import java.util.Arrays;

class Main {

    // perform the bubble sort
    public static int bubbleSort(int array[], int size) {

        // loop to access each array element
        for (int i = 0; i < size - 1; i++) {

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++) {

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String args[]) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemnts you want in your array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // call method using class name
        int[] sortedArray = new int[size];
        sortedArray = Main.bubbleSort(array, size);
        System.out.println("enter the key element you want to search ");
        int key = sc.nextInt();
        for (int i = 0; i < size; i++) {

            if (array[i] == key)
                flag = 1;
            else
                continue;
        }
        if (flag == 1)
            System.out.println("the key element is found at position  " + i);
        else
            System.out.println("the key element is not found in the array ");
    }
}
