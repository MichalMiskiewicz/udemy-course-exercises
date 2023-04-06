package pl.mmiskiewicz.lifeCycles;

public class RunnableState {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Working thread");
            for (int i = 10; i > 0; i--){
                try {
                    Thread.sleep(1000);
                    System.out.println("i " + i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        System.out.println(thread.getState()); //Runnable -> wątek rozpoczal prace
    }
}
