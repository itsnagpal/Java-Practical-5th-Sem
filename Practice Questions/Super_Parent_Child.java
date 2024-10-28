import java.util.*;
class Parent{
    Parent() {
        System.out.println("Parent constructor");
    }
    int a=40;
    void display(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
    int a=30;
    void display(){
        System.out.println("Child Class");
        System.out.println(a);
}
