//Static methods can not access non-static members.

class Main
{
    int x=10;

    public static void main(String args[])
    {
        System.out.println(x); //CE
    }
}