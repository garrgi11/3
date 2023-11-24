import java.util.*;
import java.io.*;

public class triplet {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l, tar, sum=0, a, b, c;
        
        System.out.println("ENter length of array");
        l=sc.nextInt();
        int ar[]=new int[l];
        System.out.println("Enter dem elements");
        for(int i=0; i<l;i++)
        ar[i]=sc.nextInt();
        System.out.println("Enter target sum");
        tar=sc.nextInt();
        outer:
        for(int i=0; i<l; i++)
        {
            a=ar[i];
            
            for(int j=0; j<l; j++)
            {
                b=ar[j];
                for(int k=0; k<l; k++)
                {
                    c=ar[k];
                    if(a+b+c==tar && i!=j && j!=k && j>i && k>j){
                    System.out.println(a+"\t"+b+"\t"+c);
                    continue outer;
                    }
                }

            }
        }
    }
}
