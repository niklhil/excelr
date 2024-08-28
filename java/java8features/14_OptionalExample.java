import java.util.Optional;  

 class Main
 {  
    public static void main(String[] args) {  
        String name = "scott";
        displayInUpperCase(name);
 }   

    static void displayInUpperCase(String name)
    {
       // String result=name.toUpperCase();
       // System.out.println(result);

        Optional<String> OptionalObj=Optional.ofNullable(name);

        if(OptionalObj.isPresent())
        {
          String value=OptionalObj.get();
          String result=value.toUpperCase();
          System.out.println(result); //SCOTT
        }
        else
        {
           System.out.println("Null");
        }
    }
}  