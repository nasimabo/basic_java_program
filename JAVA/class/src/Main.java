class Student{
    String name = "Nasim";
    int roll = 532930;

    void show(){
        System.out.print(roll+" /n"+name);
    }

}
class  Main{
    public static void Main(String[]args){
        Student s = new Student();
        s.show();
    }
}