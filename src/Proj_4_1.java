import java.util.Scanner;

public class Proj_4_1 {
    public static void main(String[] args) {
        System.out.println("enter 5 numbers");
        int[] a=new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=input.nextInt();
            input.nextLine();
        }
        for(int i : a)
        {
            System.out.println(i*2);
        }

    }
}
