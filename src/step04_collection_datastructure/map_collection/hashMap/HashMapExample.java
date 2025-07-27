package step04_collection_datastructure.map_collection.hashMap;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("이규현", 95);
        map.put("고유림", 100);
        map.put("김차민", 88);
        map.put("황한울", 99);
        System.out.println("총 Entry 수: "+map.size());

        //키로 값 가져오기
        String key = "이규현";
        int value = map.get(key);

        //키 Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<String> keySet = map.keySet(); //모든 키를 Set객체에 담아서 리턴
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println("key: "+k+" value: "+ v);
        }
        System.out.println();

        //엔트리 Set 컬렉션 얻고, 반복해서 키와 값 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+", "+v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("황한울");
        System.out.println("총 Entry 수: "+map.size());
        System.out.println();
    }
}
