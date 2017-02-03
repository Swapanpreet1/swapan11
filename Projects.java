package com.eval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */
public class Projects {

    int id_number;
    String name;
    List<Employee>employees_list;

    public Projects()
    {
        employees_list = new ArrayList<Employee>();

    }


    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees_list() {
        return employees_list;
    }

    public void setEmployees_list(List<Employee> employees_list) {
        this.employees_list = employees_list;
    }



    public void addEmployee(Employee emp){
        employees_list.add(emp);
    }
    public static Projects projectobj(int id, String name){
        Projects p1 =new Projects();
        p1.setId_number(id);
        p1.setName(name);
        return p1;
    }
    }



