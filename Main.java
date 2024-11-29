import java.util.Scanner;

class Hack_test {

    private int num = 100;

    private void printMessage() {
        System.out.println("Welcome to Hackerearth");

    }

    public int setint() {
        int num = this.num;
        return num;
    }

    public void setfun() {
        printMessage();
    }
}

public class Main {

    public static void main(String args[]) {
        Hack_test obj = new Hack_test();
        System.out.println(obj.setint());
        obj.setfun();
    }
}
/*
 * public class first{
 * public static void main(String[] args){ // main method
 * int choice; // declaration choice variable: choice of Operation.
 * float n1,n2; // declaring variables for taking input.
 * Operation calc = new Operation(); // creating object of operation class to
 * perform operations.
 * 
 * 
 * Scanner S = new Scanner(System.in);
 * System.out.println("Enter first no (real) : "); // printing input instuction.
 * n1 = S.nextInt(); // input of real part of first complex no.
 * System.out.println("Enter first no (imaginary) : "); // printing input
 * instuction.
 * n2 = S.nextInt(); // input of imaginary part of first complex no.
 * Operation obj1 = new Operation(n1,n2); // creating object for first complex
 * no.
 * 
 * 
 * System.out.println("Enter second no (real) : "); // printing input
 * instuction.
 * n1 = S.nextInt(); // input of real part of second complex no.
 * System.out.println("Enter second no (imaginary) : "); // printing input
 * instuction.
 * n2 = S.nextInt(); // input of imaginary part of second complex no.
 * Operation obj2 = new Operation(n1,n2); // creating object for second complex
 * no.
 * 
 * 
 * System.out.
 * println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5.  Exit"
 * );
 * System.out.println("Enter your choice(1-5) : "); // MENU
 * choice = S.nextInt(); // input of choice
 * S.close();
 * 
 * //Switch case for accepting choice
 * switch(choice){
 * case 1:
 * calc.add(obj1,obj2);
 * break;
 * case 2:
 * calc.sub(obj1,obj2);
 * break;
 * case 3:
 * calc.mult(obj1,obj2);
 * break;
 * case 4:
 * calc.div(obj1,obj2);
 * break;
 * 
 * case 5:
 * break;
 * default:
 * System.out.println("Please enter the valid choice");
 * break;
 * }
 * 
 * }
 * }
 * 
 * class Operation{
 * float real,img;
 * Operation(){
 * real=0;
 * img=0;
 * }
 * 
 * Operation(float n1, float n2){
 * real=n1;
 * img=n2;
 * }
 * 
 * public void add(Operation obj1,Operation obj2){
 * 
 * real = obj1.real+obj2.real;
 * img = obj1.img+obj2.img;
 * System.out.println("Addition : "+"("+real+")"+" + "+"("+img+")"+" i");
 * }
 * 
 * public void sub(Operation obj1,Operation obj2){
 * 
 * real = obj1.real-obj2.real;
 * img = obj1.img-obj2.img;
 * System.out.println("Subtraction : "+"("+real+")"+" + "+"("+img+")"+" i");
 * }
 * 
 * public void mult(Operation obj1,Operation obj2){
 * 
 * real = obj1.real*obj2.real-obj1.img*obj2.img;
 * img = obj1.real*obj2.img+obj1.img*obj2.real;
 * System.out.println("Multiplication : "+"("+real+")"+" + "+"("+img+")"+" i");
 * }
 * 
 * public void div(Operation obj1,Operation obj2){
 * 
 * real =
 * (obj1.real*obj2.real+obj1.img*obj2.img)/(obj2.real*obj2.real+obj2.img*obj2.
 * img);
 * img =
 * (obj1.img*obj2.real-obj1.real*obj2.img)/(obj2.real*obj2.real+obj2.img*obj2.
 * img);
 * System.out.println("Division : "+"("+real+")"+" + "+"("+img+")"+" i");
 * }
 * 
 * 
 * }
 */
