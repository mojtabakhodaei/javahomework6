package javahomework6;

import java.util.ArrayList;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();

        takeNumber(numbers);

        if (numbers.size() % 2 != 0)
            numbers.remove(numbers.size() - 1);

        removeInappropriateCouples(numbers);

        printNumbersArray(numbers);
    }

    protected static void takeNumber(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);

        Boolean bool = true;
        int num;
        do {
            System.out.println("Enter your numbers: ");
            num = scanner.nextInt();
            if (num != -1000)
                numbers.add(num);
            else
                bool = false;

        } while (bool);
    }


    protected static void removeInappropriateCouples(ArrayList<Integer> numbers) {
        int counter = 0;
        while (counter < numbers.size() - 1) {
            if (numbers.get(counter) > numbers.get(counter + 1)) {
                numbers.remove(counter);
                numbers.remove(counter);
            } else
                counter += 2;
        }
    }

    protected static void printNumbersArray(ArrayList<Integer> numbers) {
        System.out.println("new Arraylist is:");
        for (int number : numbers)
            System.out.print(number + "\t");
    }
}
