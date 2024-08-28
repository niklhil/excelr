/* Static members are accessed using null reference variable */

class Maths
{
    static final double PI=3.142;

    static int sqr(int x)
    {
       return x*x;
    }
}

class Main
{
    public static void main(String args[])
    {
        Maths mRef=null;
        System.out.println(mRef.PI);  //3.142

        int result=mRef.sqr(4);
        System.out.println(result);     //16
     }
}