package pl.mmiskiewicz.lifeCycles;

public class TimedWaitingState {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        Thread.sleep(100); // uspienie glownego watku
        System.out.println(thread.getState()); // TIMED_WAITING
    }
}
