package step05_lamda_and_stream.stream;

import java.util.*;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("이규현");
        list.add("이규현"); //중복
        list.add("김규현2");
        list.add("김규현3");
        list.add("이규현4");
        
        list.stream()
                .distinct()
                .forEach(name -> System.out.println(name));
        System.out.println();
        
        //김으로 시작하는 요소 필터링
        list.stream()
                .filter(name -> name.startsWith("김"))
                .forEach(name -> System.out.println(name));
        System.out.println();

        //중복요소 먼저 제거 후 -> 필터링
        list.stream()
                .distinct()
                .filter(name -> name.startsWith("김"))
                .forEach(name -> System.out.println(name));
    }
}
