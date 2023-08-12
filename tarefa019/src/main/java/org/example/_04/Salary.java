package org.example._04;

public class Salary {
    public void employeeMethod(Employee employee) {
        double monthlySalary = getMonthlySalary(employee.getYearlySalary(), employee.getAwards());
    }

    public double getMonthlySalary(double yearlySalary, double awards) {
        return (yearlySalary + awards)/12;
    }
}
