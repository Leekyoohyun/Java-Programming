package step03_multi_thread.thread04_thread_state.yield;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workT-A");
        WorkThread workThreadB = new WorkThread("workT-B");
        workThreadA.start();
        workThreadB.start();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        workThreadA.work = false;

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){}
        workThreadB.work = true;
    }
}
