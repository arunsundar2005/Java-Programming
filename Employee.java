public class Employee {  // class difine 

    protected int id_no = 00001; // It is accesable through out the subclasses
    private int sys_pass = 1111; // only to this class - only to employee

    String name, company; // comman variables
    // Initilization is a must 
    Employee(String x, String y) // constructor
    {
        this.name = x;
        this.company = y;
        this.id_no = 6565;
        this.sys_pass = 0000;
    }


    public void display_records()
    {
        System.out.println("Mr./Mrs" + this.name + " works in the company : " + this.company);
    }

    public void print_pass()
    {
        System.out.println("The sys_pass of " + this.name + " is : " + this.sys_pass);
    }

    public void fire()
    {
        System.out.println("Firing the employee " + this.name);
    }

      
}


// Scanner sc = new Scanner(system.in)

// use of constructor

// default values, common values, initialize.

// Method Overriding


// function -> it does have any object or class associated with it.

// method -> it belongs to any class / object (All functions in Java are methods)


// python has funcrions and methods

/*

def area(a): # function only 
    return a*a

class rectangle :
    def area(self,l,b): # A method
        return l*b

*/


// we will have 2 methods with same name, same return type and same paramets.


