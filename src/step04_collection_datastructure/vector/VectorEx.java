package step04_collection_datastructure.vector;

import step04_collection_datastructure.arrayList.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        //Vector 컬렉션 생성
        List<Board> list = new ArrayList<>();

        //작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run(){
                //객체 1000개 추가
                for(int i=1; i<=1000; i++){
                    list.add(new Board("제목"+i,"내용"+i, "글쓴이"+i));
                }
            }
        };

        //작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run(){
                //객체 1000개 추가
                for(int i=1001; i<=2000; i++){
                    list.add(new Board("제목"+i,"내용"+i, "글쓴이"+i));
                }
            }
        };

        //작업 스레드 실행
        threadA.start();
        threadB.start();

        //작업 스레드들 모두 종료될 때까지 메인 스레드 기다리도록.
        try{
            threadA.join();
            threadB.join();
        }catch (Exception e){
        }

        //저장된 총 객체 수
        int sizeOfVector = list.size();
        System.out.println(sizeOfVector);
        System.out.println();
    }
}
