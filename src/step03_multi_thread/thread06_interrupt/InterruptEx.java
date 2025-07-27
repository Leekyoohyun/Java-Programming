package step03_multi_thread.thread06_interrupt;

public class InterruptEx {
    public static void main(String[] args) {
        Thread thread = new UseInterrupt();
        thread.start();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
        }

        thread.interrupt(); //interrupt()메소드 호출
    }
}
