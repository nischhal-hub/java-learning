public class ClassesAndObj {
        String name;
        ClassesAndObj(String name){
            this.name = name;
        }
        public void printName(){
            System.out.println(name);
        }

    public static void main(String a[]){
        ClassesAndObj outer = new ClassesAndObj("Exxample...");
        outer.printName();

    }
}
