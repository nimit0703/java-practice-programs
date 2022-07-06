public class MathodOverloading {
    public static void main(String[] args) {
      Add.adder(2,3); 
      Add.adder(2,3,6); 
      Add.adder(7," is added successfully");
    }
    static class Add{

        static void adder(int a,int b){System.out.println(a+b);}
        static void adder(int a,int b,int c){System.out.println(a+b+c);}
        static void adder(int b, String s){System.out.println(b+s);}
    }
}
