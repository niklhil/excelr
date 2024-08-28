// Find out if a character is a alphabet

class Main
{
    public static void main(String[] args)
    {
        String name = "Core Java";

        if(Character.isLetter(name.charAt(5)))
        {
            System.out.println("Alphabet!");
        }
     
       if(Character.isDigit('6'))
        {
            System.out.println("Digit");
        }

        if(Character.isSpace(' '))
        {
            System.out.println("Space");
        }
    }
}