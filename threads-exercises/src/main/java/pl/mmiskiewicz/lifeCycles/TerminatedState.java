package pl.mmiskiewicz.lifeCycles;

public class TerminatedState {
    public static void main(String[] args) throws  InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run");
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println(thread.getState()); // TERMINATED - po zakonczeniu dzialania uruchomionego watku
    }
}
