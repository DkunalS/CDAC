package day03_26_09_2024.oops;

public class EmployeePortal
{
    public static void main(String[] args) {
        PayRoll payRoll = new PayRoll();

        SalariedEmployee se = new SalariedEmployee(345,"sss",80000);
        payRoll.displayGross(se);
        payRoll.displayNet(se);

        Employee [] emps = new Employee[2];
        emps[0] = new SalariedEmployee(667,"aaaaa",60000);
        emps[1] = new SalariedEmployee(456,"kkk",50000);
        /*
        CalculateGross() is defined in Employee and overridden in salariedEmployee
        Hence, can we invoked using Employee Refrence emps[0]
         */
        payRoll.displayGross(emps[0]);
        /*
        To invoke CalculateNet() which is defined in salariedEmployee
        The Employee refrence must be downcasted to SalariedEmployee
         */

        SalariedEmployee ss = (SalariedEmployee)emps[0];        // Down Casting
        payRoll.displayNet(ss);

        for(Employee e: emps)
        {
            payRoll.displayGross(e);
            if(e instanceof Manager)        // Type checking operator
                ((Manager)e).displayAllowances();
        }
    }
}
