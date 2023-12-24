package lab3;

public class lab3_2_employeerep {
    public static class Employee {
        String fullname;
        double salary;

        public Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }

        public String getFullname() {
            return fullname;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "fullname='" + fullname + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }



    public static void main(String[] args) {
        Employee[] d = new Employee[2];
        d[0] = new Employee("RiRam", 3.14);
        d[1] = new Employee("DBCooper", 3.14);
    }
}
