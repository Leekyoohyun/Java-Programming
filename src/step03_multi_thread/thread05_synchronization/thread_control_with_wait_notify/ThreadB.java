package step03_multi_thread.thread05_synchronization.thread_control_with_wait_notify;

public class ThreadB extends Thread {
    private WorkObject workObject;

    public ThreadB(WorkObject workObject){
        setName("ThreadB");
        this.workObject = workObject;
    }

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            workObject.methodB();
        }
    }
}
