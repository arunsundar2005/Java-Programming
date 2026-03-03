# Inheritance

It is basically the process of one class acquiring the properties of another classs


Example: Animal 

Common attributes: Cannot speak, cannot fly, etc etc.


Lion -> New Class

Lion IS A Animal 

Lion is a child class of Animal 

This is what we call it as inheritance.


Types of Inheritance

1. Single Inheritance 
```
public class Employee {  // class difine 

    String name, company; // comman variables
    // Initilization is a must 
    Employee(String x, String y) // constructor
    {
        this.name = x;
        this.company = y;
    }


    public void display_records()
    {
        System.out.println("Mr./Mrs" + this.name + " works in the company : " + this.company);
    }


      
}





public class Manager extends Employee {
    // has to inherit from the Employee.
    // IS-A relatrionship -> satisfied -> Inherit, else no
    // String name, company;
    int man_sal = 0;

    public Manager(String name, String company) {
        // this.name = name;
        // this.company = company;
        super(name, company);
        // super -> key word -> super class / parent class
        this.man_sal = 50000;
    }


    public void display_sal()
    {
        System.out.println("The salary of this employee is : " + this.man_sal);
    }   

}



public class Emp_details {
    

    public static void main(String[] args)
    {
        // syntax to declare a object of a class
        // class_name obj_nam = new constructor()
        // new -> keyword


        Manager Akash = new Manager("Akash", "Adobe");
        Akash.display_records(); // beglongs to employee class
        Akash.display_sal(); // belongs to manager class
    }

}


```



Super class / upper class / parent class : Employee

Lower class / child class / sub class : Manager


Manager extends Employee


Managaer IS-A Employee



2. Multi-level Inheritance

Parent Class : Class A

Class B extends Class A (Single Inheritance)

Class C extends Class B (Mulit - level inheritance)



3. Hierarchial Inheritance

Parent Class : Class A

Class B extends Class A (Single Inheritance)

Class C extends Class A (Hierarchial Inheritace)


4. Multiple Inheritance

Parent Class : Class A

Class X -> new class

Class B extends Class A , Class X



Java Does not support Muliple Inheritance
