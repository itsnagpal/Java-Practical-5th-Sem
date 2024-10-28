public class Abstract_class{
    public static void main(String[] args) {

        Dog animal2 = new Dog();
        Cat animal3 = new Cat();


        animal2.sound();
        animal2.display();
        animal3.sound();
        animal3.display();
    

    }
}
abstract class Animals{
    abstract public void sound();
    void display(){
        System.out.println("This is a abstract class");
    }
}
class Dog extends Animals{
    public void sound(){
        System.out.println("This Dog Barks");
    }
    void display(){
        System.out.println("This is a Dog Class");
    }
}
class Cat extends Animals{
    public void sound(){
        System.out.println("This Cat says Mew");
    }
    void display(){
        System.out.println("This is a cat class");
    }
}