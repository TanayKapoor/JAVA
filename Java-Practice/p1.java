//First prog
interface Bank
{
    float rateOfInterest();
}
class SBI implements Bank{
    public float rateOfInterest()
    {
        return 9.15f;
    }
}
class PNB implements Bank{
    public float rateOfInterest()
    {
        return 9.7f;
    }
}
public class p1 {


    public static void main(String[] args) {
        Bank b=new SBI();
        System.out.println("ROI: "+b.rateOfInterest());
        Bank b2=new PNB();
        System.out.println("ROI: "+b2.rateOfInterest());
//       SBI s1=new SBI();
//       s1.rateOfInterest();
    }

}