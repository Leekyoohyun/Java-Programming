package step05_lamda_and_stream.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Set 컬렉션
        Set<String> set = new HashSet<>();
        set.add("이규현1");
        set.add("이규현2");
        set.add("이규현3");

        //Stream으로 반복처리하기
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
