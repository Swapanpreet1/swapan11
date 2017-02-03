package com.eval;
import javax.swing.text.html.HTMLDocument;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */
public class companyclient {

    public static void main(String[] args) {

        List<company> companies = new ArrayList<>();
        //List<Department> departments;

        company co1 = company.companyobject(1,"appdirect");

        Department d1 = Department.deptobj(1, "hr");

        Department d2 = Department.deptobj(2,"qa");

        Department d3 = Department.deptobj(3,"it");

        Department d4=Department.deptobj(4,"oo");

        Department d5=Department.deptobj(5,"abc");

        co1.addDepts(d1);
        co1.addDepts(d2);
        co1.addDepts(d3);
        co1.addDepts(d4);
        co1.addDepts(d5);

        Projects p1 = Projects.projectobj(1,"company");
        Projects p2 = Projects.projectobj(2,"ss");
        Projects p3=  Projects.projectobj(3,"sss");
        //Projects p4= Projects.projectobj(4,"dd");


 //    Projects p5=Projects.projectobj(5,"ff");

        d1.addProjects(p1);
        d1.addProjects(p2);
        d1.addProjects(p3);

        Projects p4= Projects.projectobj(4,"dd");

        d2.addProjects(p4);


        Projects project5 = Projects.projectobj(1,"Testing");
        d3.addProjects(project5);


        //d3.addProjects(p5);

        Employee e1 = Employee.empobj(1,"swapan",21);
        Employee e2=Employee.empobj(2,"dd",21);
        //Employee e3=Employee.empobj(3,"ss",33);

        p1.addEmployee(e1);
        p1.addEmployee(e2);

        Employee e3=Employee.empobj(3,"ss",33);

        p2.addEmployee(e3);

        Employee e4=Employee.empobj(4,"hh",33);
        p3.addEmployee(e4);



        Address homeAddress1 = Address.addressobj("abc","mumbai");
        Address officeAddress1 = Address.addressobj("dd","banglore");
        e1.addAddress(homeAddress1);
        e1.addAddress(officeAddress1);

        Address homeAddress2 = Address.addressobj("hh","ssd");
        Address officeAddress2 = Address.addressobj("uu","delhi");
        e2.addAddress(homeAddress2);
        e2.addAddress(officeAddress2);


        Address homeAddress3 = Address.addressobj("kkkk","delhi");
        Address officeAddress3 = Address.addressobj("ooo","chd");
        e3.addAddress(homeAddress3);
        e3.addAddress(officeAddress3);

        Address homeAddress4 = Address.addressobj("oop","chd");
        Address officeAddress4 = Address.addressobj("jbj","chd");

        e4.addAddress(homeAddress4);
        e4.addAddress(officeAddress4);



        companies.add(co1);


        company co2 = company.companyobject(1,"appdirect");

        Department d6= Department.deptobj(1, "hr");

        Department d7 = Department.deptobj(2,"qa");

        Department d8 = Department.deptobj(3,"it");

        Department d9=Department.deptobj(4,"oo");

        Department d10=Department.deptobj(5,"abc");

        co2.addDepts(d6);
        co2.addDepts(d7);
        co2.addDepts(d8);
        co2.addDepts(d9);
        co2.addDepts(d10);

        Projects p6 = Projects.projectobj(1,"testing");
        Projects p7 = Projects.projectobj(2,"forums");
        Projects p8=  Projects.projectobj(3,"sss");
        //Projects p4= Projects.projectobj(4,"dd");


        //    Projects p5=Projects.projectobj(5,"ff");

        d6.addProjects(p6);
        d6.addProjects(p6);
        d6.addProjects(p7);

        Projects p9= Projects.projectobj(4,"dd");

        d7.addProjects(p9);


        //Projects project5 = Projects.projectobj(1,"Testing");
        //d3.addProjects(project5);


        //d3.addProjects(p5);

        Employee e5 = Employee.empobj(1,"swapan",21);
        Employee e6=Employee.empobj(2,"dd",21);
        //Employee e3=Employee.empobj(3,"ss",33);

        p6.addEmployee(e5);
        p6.addEmployee(e6);

        Employee e7=Employee.empobj(3,"ss",33);

        p6.addEmployee(e7);

        Employee e8=Employee.empobj(4,"hh",33);
        p7.addEmployee(e8);



        Address homeAddress11 = Address.addressobj("abc","mumbai");
        Address officeAddress11 = Address.addressobj("dd","banglore");
        e5.addAddress(homeAddress11);
        e5.addAddress(officeAddress11);

        Address homeAddress12 = Address.addressobj("hh","ssd");
        Address officeAddress12 = Address.addressobj("uu","delhi");
        e6.addAddress(homeAddress12);
        e6.addAddress(officeAddress12);


        Address homeAddress13 = Address.addressobj("kkkk","delhi");
        Address officeAddress13 = Address.addressobj("ooo","chd");
        e7.addAddress(homeAddress13);
        e7.addAddress(officeAddress13);

        Address homeAddress14 = Address.addressobj("oop","chd");
        Address officeAddress14 = Address.addressobj("jbj","chd");

        e8.addAddress(homeAddress14);
        e8.addAddress(officeAddress14);



        companies.add(co2);

        for (company co:companies)
        {
            System.out.println("Company:  "+co.getC_id() + " " + co.getC_name() );
            List<Department> depts1 = co.getDepartments_list();

            for (int i = 0; i < depts1.size() ; i++) {
                System.out.println("Department:  " +depts1.get(i).getId()+" "+depts1.get(i).getName() );
                int j=0;
                Department dept = depts1.get(i);
                List<Projects> pro1 = dept.getProjects_list();

              while(j<pro1.size()) {
                    Projects proj = pro1.get(j);
                    System.out.println(" Project:  " + proj.getId_number() + " " + proj.getName());

                    List<Employee> empls = proj.getEmployees_list();
                    Iterator<Employee> itr = empls.iterator();
                    while(itr.hasNext()){
                        Employee emp =itr.next();
                        int k=0;
                        Address addr = emp.getAddresses_list().get(k);
                        System.out.println("Employee:  "+emp.getId_number()+" "+ emp.getName()+" "+emp.getAge());
                        System.out.println("  HomeAddress:"+addr.getStreet()+", "+addr.getCity());
                        k++;
                        addr = emp.getAddresses_list().get(k);
                        System.out.println("OfficeAddress:"+addr.getStreet()+", "+addr.getCity());
                                j++;
                }




            }

        }

    }
}
}



