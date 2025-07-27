package step02_ObjectiveProgramming.exception;

public class ExceptionEx {
    public static void printLength(String data){
        int result = data.length();

        System.out.println("문자 수: "+result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
    
    public static void printLengthWithException(String data){
        try{
            int result = data.length();
            System.out.println("문자 수: "+result);
        }catch (NullPointerException e){
            // 예외 정보 얻기 3가지
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();
        }finally {
            System.out.println("[마무리 실행]\n");
        }
    }
}
