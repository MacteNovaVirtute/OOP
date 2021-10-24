import java.util.Random;

public class Developer extends Employee{
    int fixedBugs;

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", fixedBugs=" + fixedBugs +
                '}';
    }

    public Developer(long id, String name, int age, int salary, String gender, int fixedBugs) {
        super(id, name, age, salary, gender);
        this.fixedBugs = fixedBugs;

    }

    @Override
    public int getSalary() {
        return (this.salary + this.fixedBugs) * ((new Random()).nextBoolean() ? 2 : 0);
    }
}
