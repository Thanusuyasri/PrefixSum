import java.util.Scanner;

public class PrefixSumPrograd {
    public static void prefixsum(int[] array)
    {
        int p[] = new int[array.length];
        p[0] = array[0];
        System.out.println(p[0]+" ");
        for(int i=1;i< array.length;i++)
        {
            p[i]=p[i-1]+array[i];
            System.out.println(p[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        prefixsum(array);
    }
}
