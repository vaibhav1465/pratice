package arrays;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        a[i]=sc.nextInt();
            for(i=1;i<10;i++)
            {
                for(j=0;j<10-i;j++)
                {
                    if(a[j]<a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
