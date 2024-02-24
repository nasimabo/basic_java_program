class student{
    string name = "Nasim";
    int roll = 532930;

    void show(){
        System.out.print(roll+" "+name);
    }

}
class  test{
    public static void main(string[]args){
        student s = new student();
        s.show();
    }
}