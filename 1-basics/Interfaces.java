interface Animal {
    String Name = "Ram";
    void Walk();

}

class Mammal implements Animal{
    public void Walk(){
        System.out.println("Walking..");
    }
}

public class Interfaces {
    public static void main(String a[]){

        Mammal dog = new Mammal();
        dog.Walk();
        System.out.println(Mammal.Name);
    }

}
