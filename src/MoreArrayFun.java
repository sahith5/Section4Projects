public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myarray=new int[10];
        for(int i=0;i<=9;i++)
        {
            myarray[i]=i+1;
        }
        for(int num: myarray)
        {
            System.out.println(num);
        }
    }
}
