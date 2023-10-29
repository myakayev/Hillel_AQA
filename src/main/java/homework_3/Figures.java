package homework_3;
import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
       printFigure();
    }

    static void printFigure () {
        Scanner scanner = new Scanner(System.in);
        String answer;
        boolean checker = true;
        do {
            while (true){
                System.out.println("What figure do you want to print? \n" +
                        "Enter '1' to choose 'rectangle'\n" +
                        "Enter '2' to choose 'right triangle'\n" +
                        "Enter '3' to choose 'inverted right triangle'\n" +
                        "Enter '4' to choose 'triangle'");
                answer = scanner.nextLine();
                if ("1".equals(answer)){
                    printRectangle();
                    break;
                } else if ("2".equals(answer)) {
                    printRightTriangle();
                } else if ("3".equals(answer)) {
                    printInvertedRightTriangle();
                    break;
                } else if ("4".equals(answer)) {
                    printTriangle();
                    break;
                }
                else {
                    System.out.println("Make your choice, please!");
                }
           }
            System.out.println("Do you want to print one more figure?");
            answer = scanner.nextLine();
            if (answer.equals("no")) {
                checker = false;
            } else if (answer.equals("yes")) {
                checker = true;
            } else {
                System.out.println("Ok, let's continue! :)");
            }
        } while (checker);
    }
    private static void printTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's gonna be triangle. Enter height (natural number)");
        int height = scanner.nextInt();
        int base = height * 2 - 1;
        int center = base / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                if ((j < center - i) || (j > center + i)) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printInvertedRightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's gonna be inverted right triangle. Enter height (natural number)");
        int height = scanner.nextInt();
        int i = height;
        for (i = height; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= height ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printRightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's gonna be right triangle. Enter height (natural number)");
        int height = scanner.nextInt();
        int i = 1;
        while (i <= height) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            i++;
            System.out.println();
        }
    }

    private static void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's gonna be right rectangle. Enter length (natural number)");
        int length = scanner.nextInt();
        System.out.println("Enter width (natural number)");
        int width = scanner.nextInt();
        String [][]rectangle = new String[width][length];
        for (String[] array: rectangle) {
            for (String i : array) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
