package Lesson4_OOP;

public class Employee {

        String name;
        String jobName;
        private int salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getJobName() {
            return jobName;
        }

        public void setJobName(String jobName) {
            this.jobName = jobName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Employee(String name, String jobName, int salary) {
            this.name = name;
            this.jobName = jobName;
            this.salary = salary;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobName='" + jobName + '\'' +
                ", salary=" + salary +
                '}';
    }
}



