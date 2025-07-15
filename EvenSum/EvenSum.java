import java.util.Scanner;

public class EvenSum {
        public static void main(String[] args) {
        System.out.println("NIKHILESH");

        Scanner in = new Scanner(System.in);
        int n ,sum = 0;
        System.out.println("Enter size of array:");
        n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i <n; i++) {
            if (array[i] % 2 == 0)
                sum += array[i];
        }
        System.out.print("Sum of even numbers in array is " + sum);
        in.close();
    }
}
