import java.util.Arrays;

class Substring{
    public static void main(String[] args) {
        String s = " abcdefghijklmnop";
        String substring = s.substring(0);
        System.out.println("full substring: "+substring);
        substring=s.substring(0,4);
        System.out.println("first 5 char: "+substring);
    

        // substring using split
        String str = "hello to this world";
        String[] split1= str.split(" ");
        System.out.println("split by white space: "+ Arrays.toString(split1));
        split1= str.split("o");
        System.out.println("split by 'o' space: "+ Arrays.toString(split1));
    }
}