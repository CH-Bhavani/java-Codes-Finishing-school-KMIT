/*

create a Employee Class and Department Class with the following 
instance variables.

Employee-
Eno-int
Ename-string
Esal-int
Dno-int
Comm-int
YOE-int


Department
Dno-int
Dname-string
Dloc-string

create necessary constructor and setters/getters

Write a Main Class to read a set of n Employee records 
and Department records

You are now supposed to do the following 

1) Display the Number of Employees for a particular department
2) Display the Sum of Salaries of given Department No. 
3) Display the Department name who is drawing highest salary.

Read the Department Records size followed by Department Records 
followed by Employee Records size and Employee Records.



input = 4
10 IT Hyd
20 FN Pune
30 AD BLR
40 HR Sec
5
101 abc 5000 10 400 2
102 tyz 6000 20 500 17
103 hyz 8000 30 600 22
104 ryz 16000 40 700 3
105 kyz 9000 10 800 12
Hyd
10
20
output = 2
6000
HR*/


import java.util.*;
class Employee {
    int empno,esal, dno, comm, yoe;
    String ename;

    public int getDno() {
        return dno;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public int getEmpno() {
        return empno;
    }

    public int getComm() {
        return comm;
    }

    public int getEsal() {
        return esal;
    }

    public void setEsal(int esal) {
        this.esal = esal;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public Employee(int empno, String ename, int esal, int dno, int comm, int yoe) {
        this.empno = empno;
        this.ename = ename;
        this.esal = esal;
        this.dno = dno;
        this.comm = comm;
        this.yoe = yoe;
    }
}
class Department{
    int dno;
    String dname,dloc;
    public int getDno() {return dno;}

    public void setDno(int dno) {this.dno = dno;}

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDloc() {
        return dloc;
    }

    public void setDloc(String dloc) {
        this.dloc = dloc;
    }

    public Department(int dno, String dname, String dloc) {
        this.dno = dno;
        this.dname = dname;
        this.dloc = dloc;
    }
}
class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        Department[] d=new Department[m];
        for(int i=0;i<m;i++){
            d[i]=new Department(sc.nextInt(),sc.next(),sc.next());
        }
        int n=sc.nextInt();
        Employee[] e=new Employee[n];
        for(int i=0;i<n;i++){
            e[i]=new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        int dd=sc.nextInt();
        int ss=sc.nextInt();
        System.out.println(NumberOfemp(e,d,dd));
        System.out.println(SumofSalaries(e,d,ss));
        System.out.println(DeptHighestSal(e,d));

    }
// 1) Display the Number of Employees for a particular department
// 2) Display the Sum of Salaries of given Department No. 
// 3) Display the Department name who is drawing highest salar
    public static int SumofSalaries(Employee[] e,Department[] d,int ss){
        int sum=0;
        for(Employee emp:e){
            if(emp.getDno()==ss){
                sum+=emp.getEsal();
            }
        }
    return sum;
    }
    public static int NumberOfemp(Employee[] e,Department[] d,int dd){
        int count=0;
        for(Employee emp:e){
            if(emp.getDno()==dd){
                count++;
            }
        }
        return count;
    }
    public static String DeptHighestSal(Employee[] e,Department[] d){
        int sal=0,id=0;
        for(Employee emp:e){
            if(emp.getEsal()>sal){
                sal=emp.getEsal();
                id=emp.getDno();
            }
        }
        //System.out.println(id);
        for(Department dep:d){
            if(dep.getDno()==id)
                return dep.getDname();
        }
        return "-1";
    }
}
