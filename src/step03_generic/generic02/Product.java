package step03_generic.generic02;

/**
 * 제네릭 타입
 * @param <K>: kind
 * @param <M>: model
 *     타입 파라미터를 필드 타입으로 사용함.
 */
public class Product <K, M>{ //타입 파라미터로 K, M 정의
    private K kind;
    private M model;

    // 메소드
    public K getKind() { return this.kind; }
    public M getModel(){ return this.model; }
    public void setKind(K kind) {this.kind = kind;}
    public void setModel(M model) {this.model = model;}

}
