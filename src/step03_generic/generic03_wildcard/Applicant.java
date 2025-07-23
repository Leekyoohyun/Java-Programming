package step03_generic.generic03_wildcard;

public class Applicant <T> {
    public T kind;

    public Applicant(T kind){
        this.kind = kind;
    }
}
