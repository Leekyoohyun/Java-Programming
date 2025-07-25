package step03_multi_thread.thread05_synchronization.sync_method_and_block;

public class User1Thread extends Thread{
    private Calculator calculator;

    public User1Thread(){
        setName("User1Thread");//스레드 이름 변경
    }

    public void setCalculator(Calculator calculator){
        //외부에서 공유 객체인 Calculator 받아서 필드에 저장
        this.calculator = calculator;
    }

    @Override
    public void run(){ //동기화 메소드 호출
        calculator.setMemory1(100);
    }
}
