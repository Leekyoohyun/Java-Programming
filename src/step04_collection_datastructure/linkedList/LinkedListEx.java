package step04_collection_datastructure.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        //LinkedList
        List<String> linkedList = new LinkedList<>();
        //ArrayList
        List<String> arrayList = new ArrayList<>();

        //시작시간, 끝 시간
        long startTime;
        long endTime;

        //시간 측정 ArrayList
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList시간: "+ (endTime-startTime));

        //시간 측정 LinkedList
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            linkedList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList시간: "+ (endTime-startTime));
        /**
         * 특정 숫자 찾기
         * arrayList.get(i)
         * linkedList.get(i);
         */
        startTime = System.nanoTime();
        arrayList.get(5927);
        endTime = System.nanoTime();
        System.out.println("arrayList 검색 시간: "+ (endTime-startTime));

        startTime = System.nanoTime();
        linkedList.get(5927);
        endTime = System.nanoTime();
        System.out.println("linkedList 검색 시간: "+ (endTime-startTime));


    }
}
