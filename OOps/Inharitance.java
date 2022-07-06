public class Inharitance {
        public static void main(String[] args) {

        Boy rahul = new Boy();
        rahul.parent();
        rahul.boy();

        Girl neha = new Girl();
        neha.parent();
        neha.girl();
    }
}

class Parent {
    void parent() {
        System.out.println("this is parent class....");
    }
    void passion() {
        System.out.println("reading Novels");
    }
}

class Boy extends Parent {
    void boy() {
        System.out.println("hello i'm boy");
    }
    void passion() {
        System.out.println("traveling with his Sister");
    }
}

class Girl extends Parent {
    void girl() {
        System.out.println("hello i'm Girl");    
    }
    void passion(){
        System.out.println("traveling with her brother");
    }
}
