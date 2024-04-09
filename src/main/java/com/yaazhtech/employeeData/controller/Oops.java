package com.yaazhtech.employeeData.controller;

public class Oops {
}
/*
    Oops concept:
        What is OOPs in java?
        OOps in java is to improve code readability and reusability by defining a Java program efficiently.
        The main principles of object-oriented programming are :


        - 1.object
        - 2.class
- 3.Abstraction
        - 4.Encapsulation
        - 5.Inheritance
        - 6.Polymorphism

        1.Object:
        -Real World Entity
        -instance of class
-It consist of properties and task(should perform)
        Example:
        Human--->name,color,height etc(properties)
        walk(),speak(),Run(),read(),write();(task)
        method,variable
        Employee employee1=new Employee();
        create object:
        Student s1 = new Student();

        ex:

public class Test
{
    // using Dog object
    Dog obj = new Dog();

}

2.Class:
        -BluePrint that object follow
        -(without class no object forms)
        -It consist of no of object
        Ex:
        Student
        ---->properties(variable)
        -->name,std roll no,Doj-variable
        Task:read(),write(),play();method



        - Sybtax:
        - access_modifier class <class_name>
- {
        -  data member;
        - method;
        - constructor;
        - nested class;
    - interface;
- }

        3.Abstraction
        -showing only essential parts hiding implementation details;
        - ex:
        - when we dwd app-.exe-after install(all implementation part hided-only function shows)
        - 2.car brakes
        Java Program to implement
// Java Abstraction

// Abstract Class declared
        - abstract class Animal {
    - private String name;

    - public Animal(String name) { this.name = name; }

    - public abstract void makeSound();

    - public String getName() { return name; }
- }

// Abstracted class
- class Dog extends Animal {
    - public Dog(String name) { super(name); }

    - public void makeSound()
    - {
        - System.out.println(getName() + " barks");
        - }
- }

// Abstracted class
- class Cat extends Animal {
    - public Cat(String name) { super(name); }

    - public void makeSound()
    - {
        - System.out.println(getName() + " meows");
        -  }
- }

// Driver Class
- public class AbstractionExample {
    // Main Function
   -  public static void main(String[] args)
    - {
        - Animal myDog = new Dog("Buddy");
        - Animal myCat = new Cat("Fluffy");

        -  myDog.makeSound();
        - myCat.makeSound();
        - }
- }
- Output
        - Buddy barks
        - Fluffy meows

        4.Encapsulation:
        -Binding variables and method under single entity

        - class-->Name,Variables and Methods
        - ex:capsule
        - class Person {
	- private String name;
	- private int age;

	- public String getName() { return name; }

	- public void setName(String name) { this.name = name; }

	- public int getAge() { return age; }

	- public void setAge(int age) { this.age = age; }
- }

- public class Main {
	- public static void main(String[] args)
	- {
        - Person person = new Person();
        - person.setName("John");
        - person.setAge(30);

        - 	System.out.println("Name: " + person.getName());
        - System.out.println("Age: " + person.getAge());
        - }
- }


5.Inheritance:
        - Acquiring the properties of one class to another class.
        child class(derived class or subclass)
        parent class (base class or super class)
        - 1.singl
        - 2- .multiple
        - 3.multilevel
        - 4.Hierarchical Inheritance
        - 5.Hybrid


        - 1.single :

        - parent class------>child class
- Single-level inheritance -  one parent, one child

        - Multi-level Inheritance - grand parent - parent - child -child relation

        - Hierarchical Inheritance - one parent, multiple child

        - Multiple Inheritance - two parent, one child

        - Hybrid Inheritance - combination of other inheritance likewise single level with multi level inheritance is called hybrid inheritance.


        syntax:
        - class derived-class extends base-class
- {
        //methods and fields
        - }
        example:
        - import java.io.*;

// Base or Super Class1
        - class Employee {
    - int salary = 60000;
- }

// Inherited or Sub Class1
- class Engineer extends Employee {
    - int benefits = 10000;
- }

// Driver Class
- class Gfg {
    - public static void main(String args[])
    - {
        - Engineer E1 = new Engineer();
        - System.out.println("Salary : " + E1.salary
                + "\nBenefits : " + E1.benefits);
        - }
- }
- Output
        - Salary : 60000
        - Benefits : 10000


        6.Polymorphism:
        - Performing same task in different ways(method)

        - method 1:
        - Add()
        - method 2:
        - Add(int a,int b);
        - ex:
        - drawPolygon--->Square,Rectangle,Triangle
        - two types - runtime polymorphism and compiler time polymorphism
        - 1.method overloading(Compile time polymorphisms)
        - 2.Method Overriding(run time)

        - 1.method overloading(Compile time polymorphisms):
        -static Binding
        -It can be implemented in single class.
        -no need of inheritance
        -method name should be same
        -different parameter
        -Return type can be difference
        -static method can be overloaded
        -EARLY Binding

        example:
        - single class(no inheritance)
        - class OverLoading
- {
        - void add()
        - {
        - }void add(int x,int y )
        - {
        - }
        - int add(int x,int y)
        - {
        - }
        - }
        2.Method Overriding(run time):
        Dynamic Binding
        -it can be implemented in 2 different class.
        -with the help of inheritance
        -method name should be same
        -both method have same parameter
        -Return type should same
        -static method can be overridden
        -late Binding
        -method declared with Final keyword can not be overridden

        ex:(two different class-inheritance)
class Override
{
    void add()
    {
    }
    class c extends Override{
        void add()
        {
        }
    }
 */
    abstract class Animal{
        private String dog;

        public String getDog() {
            return dog;
        }

        public void setDog(String dog) {
            this.dog = dog;
        }
    }