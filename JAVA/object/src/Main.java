class student{
    String name = "NAsim";
    int roll = 533015;
    void show(){
        System.out.println(name+"\n"+roll);
    }
}
class Main {
    public static void main(String[] args) {
        student s = new student();
        s.show();
    }
}