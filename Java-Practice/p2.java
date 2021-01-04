//Second prog
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable, Showable{
    public void print()
    {System.out.println("Hello");}
    public void show()
    {System.out.println("Welcome");}
    void extra()
    {
        System.out.println("I am only member of class");
    }

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
        obj.extra();
        Printable p1= new A7();
        p1.print();

    }
}