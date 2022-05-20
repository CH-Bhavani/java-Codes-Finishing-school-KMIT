/*create a Employee Class and Department Class with the following 
instance variables.

Employee-
Eno-int
Ename-string
Esal-int
Department.Dno-int
Comm-int
YOE-int



Department
Dno-int
Dname-string
Dloc-string

create necessary setters/getters

Write a Main Class to read a set of n Employee records 
and Department records

You are now supposed to do the following 

1) Print the Number of Employees having 10+ above YOE
2) Print the Number of Employees working for a given department location







*/



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
class Main{
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
        String loc=sc.next();
        System.out.println(experience10(e,d));
        System.out.println(locationemp(e,d,loc));

    }
//    1) Print the Number of Employees having 10+ above YOE
//2) Print the Number of Employees working for a given department location
    public static int experience10(Employee[] e,Department[] d){
        int count=0;
        for(Employee emp:e){
            if(emp.getYoe()>10)
                count++;
        }
        return count;
        
    }
    public static int locationemp(Employee[] e,Department[] d,String loc){
        int count=0,depid=-1;
        for(Department dep:d){
            if(dep.getDloc().equals(loc)){
                depid=dep.getDno();
            }
        }
        for(Employee emp:e){
            if(emp.getDno()==depid)
                count++;
        }
        return count;
    }

}
