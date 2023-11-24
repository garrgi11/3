import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;
public class ceasar 
{
    public static void main(String[] args) 
    {
        char ch;
        try{
    File myObj = new File("level 3.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
    
        for(int i=0; i<data.length(); i++)
        {
            ch=data.charAt(i);
            if(Character.isUpperCase(ch)){
            if(ch!=' ' && (int)ch+16<=90)
            System.out.print((char)(((int)ch+16)));
            else if(ch!=' ' && (int)ch+16>=90)
            System.out.print((char)(((int)ch-10)));
            }
            else if(ch==' ')
            System.out.print(" ");
            if(Character.isLowerCase(ch)){
            if(ch!=' ' && (int)ch+16<=122)
            System.out.print((char)(((int)ch+16)));
            else if(ch!=' ' && (int)ch+16>=122)
            System.out.print((char)(((int)ch-10)));
            }
            else if(ch==' ')
            System.out.print(" ");
        }
        System.out.println();
      }
      myReader.close();
    }
    catch (FileNotFoundException e){
        System.out.println("chuda maa");
    }
    }
}
