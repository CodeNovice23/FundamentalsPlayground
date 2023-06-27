/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		  String str= "lets begin our coding journey";
    String rev_str="" ;//creating for reversed String
    for(int i = str.length()-1;i>=0;i--){
        rev_str+=str.charAt(i);
        
    }
    System.out.println(rev_str);

	}
}
