//Third Prog
interface Print_able{
    void print();
}
interface Show_able extends Print_able{
    void show();
}
class TestInterface4 implements Show_able{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
        Print_able p1= new TestInterface4();
        p1.print();
        Show_able s1= new TestInterface4();
        s1.print();
        s1.show();


    }
}