package someopertions;
abstract class Animal{
    abstract void makesound();
}
class Dog extends Animal {
    void makesound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void makesound(){
        System.out.println("Meow");
    }

}

public class Abstractmode {
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.makesound();
        Cat c=new Cat();
        c.makesound();

    }
}
