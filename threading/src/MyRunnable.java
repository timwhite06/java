public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " Thread (RUNNABLE) = " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
