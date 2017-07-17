package sg.edu.rp.c346.employeeinformation;

/**
 * Created by 16046469 on 17/7/2017.
 */

public class Info {
    private String name;
    private String job;
    private double salary;

    public Info(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
