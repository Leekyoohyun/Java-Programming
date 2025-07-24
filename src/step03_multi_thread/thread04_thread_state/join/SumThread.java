package step03_multi_thread.thread04_thread_state.join;

public class SumThread extends Thread{
    private long sum;

    public long getSum(){
        return sum;
    }

    public void setSum(long sum){
        this.sum = sum;
    }

    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            sum += i;
        }
    }
}
