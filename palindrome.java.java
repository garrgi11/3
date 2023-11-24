import java.util.*;
import java.io.*;
class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s, rev="";
        char ch;
        
        System.out.println("Enter dem string");
        s=sc.nextLine();
        for(int i=0; i<s.length();i++)
        {
            ch=s.charAt(i);
            rev=ch+rev;
        }  
        System.out.println(rev); 
        if(s.equalsIgnoreCase(rev))
        System.out.println("Palindrome");
        else
        System.out.println("Nope");
    }
}