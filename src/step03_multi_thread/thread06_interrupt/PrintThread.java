package step03_multi_thread.thread06_interrupt;

public class PrintThread extends Thread{
    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop; //외부에서 stop필드 변경할 수 있게
    }

    @Override
    public void run(){
        while(!stop){
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
