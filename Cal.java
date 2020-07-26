import java.lang.*;
import java.util.Scanner;
abstract class Operation
{
  abstract void getOutput(int x,int y);
}
class Addition extends Operation
{
	void getOutput(int x,int y)
  {
	  System.out.println("result="+(x+y));
  }
}
class Subtraction extends Operation
{
	void getOutput(int x,int y)
  {
		System.out.println("result="+(x-y));
	}
}
class Multiplication extends Operation
{
	void getOutput(int x,int y)
  {
		System.out.println("result="+(x*y));
	}
}
class Division extends Operation
{
	void getOutput(int x,int y)
  {
		System.out.println("result="+(x/y));
	}
}
class Cal
{
	public static void main(String args[])
  {
		Operation ob;
		Scanner input=new Scanner(System.in);
		System.out.print("a");
		int a=input.nextInt();
		System.out.print("b");
		int b=input.nextInt();
		System.out.println("Enter an operator:");
		char k=input.next().charAt(0);
		switch(k)
		{
      case'+':
        ob=new Add();
			  ob.getOutput(a,b);
			  break;
      case'-':
			  ob=new Add();
			  ob.getOutput(a,b);
			  break;
		  case'*':
			  ob=new Add();
			  ob.getOutput(a,b);
			  break;
		  case'/':
			  ob=new Add();
			  ob.getOutput(a,b);
			  break;
		  default:
			  System.out.println("Incorrect");
		  }
   }
}

