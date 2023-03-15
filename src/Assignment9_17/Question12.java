package Assignment9_17;

sealed interface FastFood permits Burger,Pizza{
    int calories();
}
//We use record so that it'll return constructor,getter, setter and everything else automatically. It is
//basically a type of class or immutable data classes which was introduced in Java 14.
record Burger() implements FastFood {
    public int calories() {
        return 5000;
    }
}
record Pizza() implements FastFood{
    public int calories()
    {
        return 100;
    }
}
public class Question12{
    public static void main(String[] args){
        Burger burgerObject=new Burger();
        System.out.println(burgerObject.calories());
        Pizza pizzaObject=new Pizza();
        System.out.println(pizzaObject.calories());
    }
}
