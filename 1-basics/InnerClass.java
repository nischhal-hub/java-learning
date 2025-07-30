//static nested class

class Outer{
   static int x = 10;
    static class StaticNested{
        void display(){
            System.out.println(x);
        }
    } 
}
//non-static nested inner class
class NonStatic{
    int x = 20;
    void display(){
        System.out.println("lol!! I am running inside inner."); 
    }
    class NormalInner{
        void print(){
            System.out.println(x);
            display();
        }
    }
}

//local inner class
class LocalInner{
    int x;
    void Method(){
        int y = 40;
        class Inner{
            void display(){
                System.out.println("I am local inner :" + y);   
            }
        }
        Inner i1 = new Inner();
        i1.display();
    }
}


public class InnerClass {
    
    public static void main(String[] args) {
        //static inner
        Outer.StaticNested nestedObj = new Outer.StaticNested();
        nestedObj.display();

        //non static inner
        //we can't directly call the nested here because the inner class in an instance of an object rather than implied class.
        NonStatic outer = new NonStatic();
        NonStatic.NormalInner inner = outer.new NormalInner();
        inner.print();

        //Local inner
        LocalInner l1 = new LocalInner();
        l1.Method();
    }
}
