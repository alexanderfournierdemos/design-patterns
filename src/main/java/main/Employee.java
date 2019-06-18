package main;

public class Employee {




    private final int id;
    private final String name;
    private final String email;




    public Employee(
            final int newId,
            final String newName,
            final String newEmail

    ){
        this.id = newId;
        this.name = newName;
        this.email= newEmail;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public static class EmployeeBuilder{
        private int nestedId;
        private String nestedName;
        private String nestedEmail;

    }
}
