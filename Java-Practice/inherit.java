class university
{
   public void methoduniversity()
   {
      System.out.println("Chitkara University");
   }
}
class department extends university
{
   public void methoddepartment()
   {
      System.out.println("Our university has 10 departments");
   }
}
class employee extends department
{
  public void methodemployee()
  {
     System.out.println("Our university has 10000 employees");
  }
}
class placement extends employee
{
  public void methodplacement()
  {
     System.out.println("Our university has placements");
  }
}
class student extends placement
{
  public void methodstudent()
  {
     System.out.println("Our university has thousands of students");
  }
}
class inherit
{
  public static void main(String args[])
  {
     department obj1 = new department();
     employee obj2 = new employee();
     placement obj3 = new placement();
     student obj4 = new student();

     obj1.methoduniversity();
     obj2.methodemployee();
     obj3.methodplacement();
     obj4.methodstudent();
  }
}