package string;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []a=s.toCharArray();
        Arrays.sort(a);
        s =new String(a);
        System.out.println(s);
        int t,h=Integer.MIN_VALUE;
        char d[]=new char[s.length()];
        int c[]=new int[s.length()];
        int k=0,i,j;
        for(i=0;i<s.length();i++)
        {
            t=0;
            for(j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    t++;
                }
            }
            i+=t;
            i-=1;
            if(h<t)
                h=t;
            d[k]=s.charAt(i);
            c[k]=t;
            k++;
        }
        for(i=0;i<k;i++)
            if(c[i]==h)
                System.out.println(d[i]+":"+c[i]);
    }
}
