package assignment_F1_streams;

interface  parent{
    default void show(){
        System.out.println("Parent Interface");
    }
}

interface  childOne extends parent {

    default void show(){
        System.out.println("Child One Interface");
    }
}

interface  childTwo extends parent {

    default void show(){
        System.out.println("Child Two Interface");
    }
}

public class Question3 implements childOne, childTwo{
    public void show(){
        System.out.println("Class Interface");
    }

    public static void main(String[] args) {
        Question3 My_Obj= new Question3();
        My_Obj.show();
    }
}



