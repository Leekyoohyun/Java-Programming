package step04_collection_datastructure.set_collection.hashSet;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("Java");
        set.add("JSP");
        set.add("JDBC");
        set.add("Java"); //중복 객체는 저장 X
        set.add("Spring");

        //저장된 객체 수
        int setSize = set.size();
        System.out.println(setSize);

        //객체를 하나씩 가져와서 처리
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            //객체 하나씩 가져오기
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")){
                iterator.remove();
            }
        }
        System.out.println();

        //향상 for
        for(String elem : set){
            System.out.println(elem);
        }
    }
}
