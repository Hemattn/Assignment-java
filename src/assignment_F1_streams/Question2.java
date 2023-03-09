package assignment_F1_streams;

interface MathOperation{
    int operation(int num1, int num2);


}
class Calculator{
    static int multiplication(int x, int y){
        return x*y;
    }
    int sum(int x, int y){
        return x+y;
    }
    int subtract(int x, int y){
        return x-y;
    }
}
public class Question2 {
    public static void main(String[] args) {
        MathOperation multi=Calculator::multiplication;
        System.out.println("Multiple =" +multi.operation(2,3));

        MathOperation sum = new Calculator()::sum;
        System.out.println("sum: "+sum.operation(2,3));

        MathOperation subtract = new Calculator()::subtract;
        System.out.println("Subract: "+subtract.operation(3,2));
    }
}
