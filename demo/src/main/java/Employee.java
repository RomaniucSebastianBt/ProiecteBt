public class Employee {


    private int emp_id, emp_salary;

      private  String emp_name, emp_address, emp_department, emp_email;

    public Employee(int emp_id, int emp_salary, String emp_name, String emp_address, String emp_department, String emp_email) {
        this.emp_id = emp_id;
        this.emp_salary = emp_salary;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_department = emp_department;
        this.emp_email = emp_email;
    }

        public int getEmp_id() {

            return emp_id;
        }

        public void setEmp_id(int emp_id) {

            this.emp_id = emp_id;
        }

        public int getSalary() {

            return emp_salary;

        }

        public void setSalary(int emp_salary) {

            this.emp_salary = emp_salary;

        }

        public String getName() {

            return emp_name;

        }

        public void setName(String emp_name) {

            this.emp_name = emp_name;
        }

        public String getAddress() {

            return emp_address;

        }


        public void setAddress(String emp_address) {

            this.emp_address = emp_address;

        }

        public String getDepartment() {

            return emp_department;

        }

        public void setDepartment(String emp_department) {

            this.emp_department = emp_department;
        }

        public String getEmail() {

            return emp_email;
        }

        public void setEmail(String emp_email) {

            this.emp_email = emp_email;

        }


    }




