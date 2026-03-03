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
        System.out.println("The Id of " + this.name + " is : " + this.id_no);
        super.print_pass();
    }   

    @Override // anotators
    public void fire()
    {
        System.out.println(this.name + " is a manager, so cannot be fired, sorry !");
    }

}
