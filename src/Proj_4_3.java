import java.util.Scanner;

public class Proj_4_3 {
    public static void main(String[] args) {
        String[] names=new String[5];
        Scanner input=new Scanner(System.in);
        int [] age=new int[5];
        for (int i=0;i<5;i++)
        {
            System.out.println("enter names and age");
            names[i]=input.nextLine();
            age[i]=input.nextInt();
            input.nextLine();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(names[i]+" is "+age[i]+" of age");
        }
    }
}
