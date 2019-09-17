
/**
 * Write a description of class TestMemberOuter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMemberOuter
{
    private int data=30;
    class Inner
    {
        void msg()
        {
            System.out.println("Data is="+data);
        }
    }
    void display()
    {
        Inner in=new Inner();
        in.msg();
    }
   /* public static void main(String [] a)
    {
        TestMemberOuter obj=new TestMemberOuter();
        obj.display();
    }*/
}
class Test
{
   public static void main(String [] a)
   {
       TestMemberOuter obj_inner=new TestMemberOuter();
       obj_inner.display();
    }
}