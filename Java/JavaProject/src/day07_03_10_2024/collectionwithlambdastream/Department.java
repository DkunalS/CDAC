package day07_03_10_2024.collectionwithlambdastream;

public class Department {
    private String deptName;
    private int empId;

    public Department( int empId, String deptName) {
        super();
        this.deptName = deptName;
        this.empId = empId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


}
