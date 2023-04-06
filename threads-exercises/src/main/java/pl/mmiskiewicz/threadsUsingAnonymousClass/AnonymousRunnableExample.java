package pl.mmiskiewicz.threadsUsingAnonymousClass;

public class AnonymousRunnableExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 10; i++){
                    System.out.println("Wartość i: " + i);
                }
            }
        });

        thread.start();
    }
}
