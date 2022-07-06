


class Animal{

    // creating Constructor
    Animal(){
        System.out.println("I am constructor");

    }

    
    void habit(){
        System.out.println("eat");
        System.out.println("sleep");
        System.out.println("Repete");
    }

    
}



public class Constructor{
public static void main(String[] args) {

    Animal lion = new Animal();
    lion.habit();

    // nonStaticMethod();
    // staticMethod();

    
}

static void staticMethod(){
    System.out.println("hey i am static method");
}

void nonStaticMethod(){
   System.out.println("i am non static method");

}

}
