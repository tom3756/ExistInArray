import java.util.Scanner;

public class existInArray {
    public static void main(String[] args) {
        boolean inArray = false;
        int[] numbers = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987};
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to check if it is the array : \n");
        int arraySearch = reader.nextInt();
        int i = 0;

        for (i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == arraySearch) {
                System.out.println(arraySearch + " is index #" + i + " in the array.");
                inArray = true;
            }
        }
        if (!inArray) {
            System.out.println(arraySearch +" does not appear in the array!");
        }
    }
}

