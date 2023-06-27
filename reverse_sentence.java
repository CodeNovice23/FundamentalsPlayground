/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


*******************************************************************************/
import java.util.*;
public class reverse_sentence

{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter sentence");
    String str =sc.nextLine();
    String word =" ";
    str= str+" ";
    String rev_str="" ;//creating for reversed String
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch!=' ')
        {
            word+=ch;
        }
        else{
            rev_str=word+" "+rev_str;
            word="";
        }
        
    }
    System.out.println(rev_str);
	}
}
