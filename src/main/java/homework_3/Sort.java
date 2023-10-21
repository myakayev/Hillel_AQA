package homework_3;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        double [] arr = new double[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                arr[i] = Double.parseDouble(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter numbers, please!");
        }
        printDefaultArray(arr);
        printAsc(arr);
        printDesc(arr);
        printInner(arr);

    }
    static void printDefaultArray (double []arr){
        System.out.println("Base: " + Arrays.toString(arr));
    }

    static void printAsc (double []arr){
        System.out.println("Asc: " + Arrays.toString(ascSort(arr)));
    }
    static void printDesc (double []arr){
        System.out.println("Desc: " + Arrays.toString(sortDescArray(arr)));
    }

    static double[] ascSort (double[] arr){
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return arr;
    }

    static double[]  sortDescArray (double []arr){
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] < arr[i]) {
                    // Міняємо місцями елементи, якщо вони не відсортовані
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return arr;
    }
    static void printInner (double []arr){
        boolean swapped;
        int n = arr.length;
        do {
            swapped = false;
            int i = 0;
            int j = 0;
            if (arr.length % 2 == 0 && (n - j) > 4 || arr.length % 2 == 1 && (n - j) > 3) { // перевірка довжини масиву на парність/непарність, щоб зрозуміти, коли зупинитись в сортуванні
                for (i = 0; i < n; i++) {
                    double[] subArray = Arrays.copyOfRange(arr, i, n); // створення копії частини масиву для сортування по спаданню
                    sortDescArray(subArray);
                    System.arraycopy(subArray, 0, arr, i, subArray.length); // "повернення" частини відсортованого звіту в початковий масив
                    j = i + 1;
                    Arrays.sort(arr, j, n); // сортування частини масиву за зростанням
                    swapped = true; // стоп-слово :)  не зміниться на 'false', якщо не буде виконана умова 'if'
                    n--;
                }
            }
        } while (swapped);
        System.out.println("Inner: " + Arrays.toString(arr));
    }
}
