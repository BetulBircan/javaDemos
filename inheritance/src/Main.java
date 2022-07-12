public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.BestEmployee();
        customerManager.Add();
    }
}
