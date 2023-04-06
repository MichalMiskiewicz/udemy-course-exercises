package pl.mmiskiewicz.threadsUsingLambda;

public class LambdaThread {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i = 0; i< 10; i++){
                System.out.println("Wartość i: " + i);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
