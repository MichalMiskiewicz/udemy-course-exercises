package pl.mmiskiewicz.lifeCycles;

class TestThread extends Thread {

    private Thread mainThread;

    public TestThread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        try {
            for(int i = 0; i < 3; i++){
                System.out.println(mainThread.getState()); // WAITING -> stan głównego wątku main po wykonaniu join()
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " finished");
    }
}

public class WaitingState {

    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread(); // glowny watek

        TestThread thread1 = new TestThread("Thread 1", mainThread);
        thread1.start();
        thread1.join(); //główny wątek czeka na wykonanie thread 1

        System.out.println("Main thread.");
        TestThread thread2 = new TestThread("Thread 2", mainThread);


    }
}
