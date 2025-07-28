package step05_lamda_and_stream.stream;

import java.util.*;
public class SortedExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("이규현1", 100));
        studentList.add(new Student("이규현2", 50));
        studentList.add(new Student("이규현3", 80));

        //오름차순
        studentList.stream()
                //231
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(student ->
                        System.out.println("이름: "+student.getName()+",점수: "+student.getScore()));
        System.out.println();

        //내림차순
        studentList.stream()
                //132
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(student ->
                        System.out.println("이름: "+student.getName()+",점수: "+student.getScore()));
    }
}
