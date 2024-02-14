import java.util.*;
class Stack
{
    int arr[];
    int tos;
    Scanner sc = new Scanner(System.in);     
    void assign(int a)
    {
        tos=-1;
        arr = new int[a];
    }
     
    void push(int x)
    {       
       
      if(tos==arr.length-1)
      {
      	System.out.println("stack overflow");
      }
	  else
	  {
	    tos=tos+1;
	    arr[tos]=x;
	  }

    }
 
    void pop()
    {
	   if(tos==-1)
	   System.out.println("stack underflow");
	   else
	   tos=tos-1;
    }
    void display()
    {
	   if(tos==-1)
	   System.out.println("no elements to display");
	   else
	   {
          for(int i=0; i<=tos; i++)
          {
             System.out.print(arr[i] + " ");
          }
        System.out.println();
    }
}
}
public class StackTest
{
   public static void main(String args[])
   {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the 1st array : ");
        int a = sc.nextInt();
        Stack ob1 = new Stack();
        ob1.assign(a);
        int i=1;
	    while(i!=0)
        {  
	       System.out.println("enter 0 to exit");
           i=sc.nextInt();
           System.out.println("1.push\n2.pop\n3.display");
	       int l=sc.nextInt();
	
	       switch(l)
	       {
	          case 1:
	          {
	            System.out.println("enter the element");
	            int x=sc.nextInt();
	            ob1.push(x);
	            break;
	          }
	          case 2:
	          {
	          	ob1.pop();
	            break;
	          }
	             
	          case 3:
	          {
	            ob1.display();
	            break;
	          }
	       }
	
}
}

}
         

