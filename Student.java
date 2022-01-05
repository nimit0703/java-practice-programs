class Student{
    int id;
    String name;
    void insertnum(int n, String s){
        id = n;
        name = s;
    }
    void displayinfo(){
        System.out.println(id+" "+name);
    }
}
class Studentrun{
    public static void main(String[] args){
        Student s1  =new Student();
        Student s2  =new Student();
        s1.insertnum(125, "rusha");
        s2.insertnum(143, "nimit");
        s1.displayinfo();;
        s2.displayinfo();;
    }
}