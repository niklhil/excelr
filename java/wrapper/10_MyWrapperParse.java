class Main
{
  public static void main(String args[])
  {
    int num1=0;
    int num2=0; 	
    int sum=0;

    float fNum1=0.0f;
    float fNum2=0.0f;
    float fSum=0.0f;

    num1 = Integer.parseInt(args[0]);
    num2 = Integer.parseInt(args[1]);
    sum = num1 + num2;
    System.out.println("The int sum is :" + sum);
    
    fNum1 = Float.parseFloat(args[0]);
    fNum2 = Float.parseFloat(args[1]);
    fSum = fNum1 + fNum2;
    System.out.println("The float sum is :" + fSum);
   }	
}