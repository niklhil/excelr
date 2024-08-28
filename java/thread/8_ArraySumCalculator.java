class ArraySumCalculator implements Runnable 
{
   private int array[];
   private int partialSum;

    public ArraySumCalculator(int array[]) {
        this.array = array;
    }

    public void run() {
        for (int i =0; i <array.length; i++) {
            partialSum = partialSum + array[i];
        }
    }

    public int getPartialSum() {
        return partialSum;
    }
}

class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        int x[] = {1, 2, 3, 4};
        int y[] = {1, 2, 3};

        ArraySumCalculator calculator1 = new ArraySumCalculator(x);
        Thread thread1 = new Thread(calculator1);

        ArraySumCalculator calculator2 = new ArraySumCalculator(y);
        Thread thread2 = new Thread(calculator2);

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        thread1.join();
        thread2.join();

        int finalSum = calculator1.getPartialSum() + calculator2.getPartialSum();
        
        System.out.println("Sum : " + finalSum);
    }
}