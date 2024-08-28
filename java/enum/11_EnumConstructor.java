//Compile time error

enum Fruits 
{
   APPLE, BANANA, MANGO;

   public Fruits(){} 		//Should be private

   protected Fruits(int i){} 	//Should be private
}