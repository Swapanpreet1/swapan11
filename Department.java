package com.eval;
import java.util.ArrayList;

import java.util.List;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */
public class Department {
    int id;
    String name;

    List<Projects> projects_list;

    public Department() {
        projects_list= new ArrayList<Projects>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Projects> getProjects_list() {
        return projects_list;
    }

    public void setProjects_list(List<Projects> projects_list) {
        this.projects_list = projects_list;
    }

    public void addProjects(Projects project){
        projects_list.add(project);
    }


    public static Department deptobj(int id, String name)
    {
        Department d1 = new Department();
        d1.setId(id);
        d1.setName(name);
        return d1;
    }


}