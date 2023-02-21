package se.hkr.task1;

public class Manager extends Employee {
    private String[] projects;

    public Manager(int id, String name, String dept, double salary, String[] projects) {
        super(id, name, dept, salary);
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Manager is managing:");

        for (int i = 0; i < projects.length; i++) {
            System.out.printf("%s) %s\n", i + 1, projects[i]);
        }
    }
}
