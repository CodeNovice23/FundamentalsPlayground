/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		/**prime number is a whole number greater than 1 whose only factor is 1 and itself.**/
		for(int i=2 ;i<=50;i++){
		    boolean isprime = true;
		    for(int j=2;j<i;j++){
		        if(i%j==0){
		            isprime=false;
		            break;
		        }
		    }
		    if(isprime)
		    System.out.println(i);
		}
	}
}
