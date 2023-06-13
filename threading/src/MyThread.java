public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " Thread = " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
