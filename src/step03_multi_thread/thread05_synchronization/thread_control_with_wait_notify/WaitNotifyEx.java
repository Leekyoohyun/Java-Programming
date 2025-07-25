package step03_multi_thread.thread05_synchronization.thread_control_with_wait_notify;

public class WaitNotifyEx {
    public static void main(String[] args) {
        //공유 작업 객체 생성
        WorkObject workObject = new WorkObject();

        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();
    }
}
