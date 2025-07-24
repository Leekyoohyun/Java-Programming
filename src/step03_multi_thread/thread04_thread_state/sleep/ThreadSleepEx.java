package step03_multi_thread.thread04_thread_state.sleep;

import java.awt.*;

public class ThreadSleepEx {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            toolkit.beep();
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
            }
        }
    }
}
