public class Overloading {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(String a, String b){
        System.out.println(a+b);
    }
    void sum(float a, float b){
        System.out.println(a+b);
    }

    public static void main(String a[]){
        Overloading ov = new Overloading();
        ov.sum(1,2);
        ov.sum(2,3,4);
        ov.sum("hello","ram");
        ov.sum(1.22f,2.11f);
    }
}
