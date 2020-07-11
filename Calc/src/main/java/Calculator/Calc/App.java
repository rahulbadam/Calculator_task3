package Calculator.Calc;
import java.util.*;

public class App 
{
	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(true) {
       	System.out.println("Enter numbers: ");
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        System.out.println("Select an operation \n1.Subtraction(-)\n2.Addition(+)\n3.Division(/)\n4.Multiplication(*)");
        System.out.println("Enter any other character to exit");
        CalcMethods c = new CalcMethods(a,b);
        char operator = reader.next().charAt(0);
        double res;
        switch(operator)
        {
	    case '-':
                res = c.sub(a,b);
                break;
            case '+':
                res = c.add(a,b);
                break;
            
	    case '/':
                res = c.div(a,b);
                break;
            case '*':
                res = c.mul(a,b);
                break;
            
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.println("You have entered wrong option please try again.\n\tThankyou......");
                reader.close();              
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", a, operator, b, res);
        }
    }
}
