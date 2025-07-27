package step03_multi_thread.thread06_interrupt;

public class SafeStopEx {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }

        printThread.setStop(true); //즉시 종료
    }
}
