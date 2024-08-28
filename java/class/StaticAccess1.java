/* Static members are accessed using object */

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
        Maths m=new Maths();

        System.out.println(m.PI);        //3.142

        int result=m.sqr(3);  
        System.out.println(result);      //9 
     }
}   

