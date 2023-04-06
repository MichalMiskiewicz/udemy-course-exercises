package pl.mmiskiewicz.lifeCycles;

public class NewState {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Working thread");
        });

        //thread.start();
        System.out.println(thread.getState()); // NEW -> przed rozpoczeciem pracy
    }
}
