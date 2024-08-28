/* Static members are accessed using class name */

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
        System.out.println(Maths.PI);  //3.142

        int result=Maths.sqr(2);
        System.out.println(result);  //4
    }
}   

