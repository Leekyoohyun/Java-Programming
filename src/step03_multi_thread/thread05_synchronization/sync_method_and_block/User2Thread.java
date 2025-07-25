package step03_multi_thread.thread05_synchronization.sync_method_and_block;

public class User2Thread extends Thread{
    private Calculator calculator;

    public User2Thread(){
        setName("User2Thread");
    }

    public void setCalculator(Calculator calculator){
        this.calculator =  calculator;
    }

    @Override
    public void run(){
        calculator.setMemory2(50);//동기화 블록을 가진 메소드 호출
    }
}
