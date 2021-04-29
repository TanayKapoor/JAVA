class Box {
  double height;
  double width;
  double length;
  // Creating constructor for Box
  Box() {
    System.out.println("Creating a constructor");
    width = 10;
    height = 20;
    length = 30;
  }

  double volume() {
    return width * length * height;
  }
}

public class boxdemo6 {
  public static void main(String[] args) {
    Box Box1 = new Box();
    Box Box2 = new Box();

    double vol;

    vol = Box1.volume();
    System.out.println(vol);
    vol = Box2.volume();
    System.out.println(vol);
  }
}