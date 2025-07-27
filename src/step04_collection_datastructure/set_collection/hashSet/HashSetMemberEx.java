package step04_collection_datastructure.set_collection.hashSet;

import java.util.*;

public class HashSetMemberEx {
    public static void main(String[] args) {
        //HashSet 컬렉션
        Set<Member> set = new HashSet<>();

        //Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println(set.size());
    }
}
