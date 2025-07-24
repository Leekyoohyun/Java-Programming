package step03_multi_thread.thread04_thread_state.join;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try{
            sumThread.join();
        }catch (InterruptedException e){
        }
        System.out.println("1~10 합"+sumThread.getSum());
    }
}
