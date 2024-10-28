public class Method_Overriding{
    public static void main(String[] args) {
        Parent_Class person1= new Parent_Class();
        Child_Class person2= new Child_Class();
        person1.display();
        person2.display();
    }

}
class Parent_Class{
    void display(){
        System.out.println("This is a parent.");
    }
}
class Child_Class extends Parent_Class{
    void display(){
        System.out.println("This is a Child.");
    }
}
