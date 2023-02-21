package se.hkr.task1;

public class Developer extends Employee {
    private String technology;

    public Developer(int id, String name, String dept, double salary, String technology) {
        super(id, name, dept, salary);
        this.technology = technology;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public void work() {
        super.work();
        System.out.printf("Developer is developing %s", technology);
    }
}
