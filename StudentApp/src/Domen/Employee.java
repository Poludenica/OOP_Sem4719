package Domen;

public class Employee extends Person {
    private String special;

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }
    
    
}
