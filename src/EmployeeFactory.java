import java.util.Random;

public class EmployeeFactory {
    int size;
    Employee[] generateEmployees(int size){
        this.size = size;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        return employees;
    }



    String randGender;


    Employee generateEmployee(){
        return new Developer(generateId(), generateName(), generateAge(), generateSalary(), generateGender(), generateFixedBugs());
    }

    static String[] Women = {"Jessica", "Anna", "Alina", "Alisa", "Victoria"};
    static String[] Men = {"Ivan", "Jack", "John", "Robert", "Charles"};

    static int random(int min, int max) {
        int delta = max - min;
        double random = Math.random();
        return (int) (random * delta + min);
    }

    String generateName(){
        int random = random(0, 5);
        if (randGender =="male") {
            return Women[random];
        }
        else {
            return Men[random];
        }

        }


    long generateId(){
        return new Random().nextInt(size) + 1;
    }

    int generateAge(){
        return new Random().nextInt(100) + 1;
    }

    int generateSalary(){
        return new Random().nextInt(5000) + 1000;
    }

    String generateGender() {
        int rand = new Random().nextInt(2);

        if (rand == 1) {
            randGender = "male";
        } else {
            randGender = "female";
        }
        return randGender;
    }

    int generateFixedBugs(){
        return new Random().nextInt(200) + 50;
    }

}
