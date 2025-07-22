package step03_libs.string_operations;

public class StringBuilderEx {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0,"ABC")
                .delete(0,2)
                .replace(2,4,"ef")
                .toString();

        System.out.println(data);
    }
}
