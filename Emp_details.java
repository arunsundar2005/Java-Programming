public class Emp_details {
    

    public static void main(String[] args)
    {
        // syntax to declare a object of a class
        // class_name obj_nam = new constructor()
        // new -> keyword


        Manager Akash = new Manager("Akash", "Adobe");
        Akash.display_records(); // beglongs to employee class
        Akash.display_sal(); // belongs to manager class
        Akash.fire();

    }

}
