public class Website implements Runnable {
    public void run() {
        try {
            for (int i=1; i<=10; i++) {
                System.out.println("Loading...");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("This site can't be reached");
        }
    }
}