package AnnotationsAndJavaDoc;

@interface MyAnno{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno(name="Ajay",project="Bank")
public class UserDefinedAnnotation {
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}