/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "course")
@SessionScoped
public class CourseController implements Serializable {
    
    @EJB
    CourseManager cm;
    Course theCourse = new Course();

    @PostConstruct
    public void init() {
        System.out.println("Create " + this);
        if (cm.findCourses().isEmpty()) {
            Course c1 = new Course();
            c1.setName("Architecture JEE");
            c1.setHours(60);
            c1.setDescription("Introduction à JEE.");
            cm.saveCourse(c1);
        }
    }

    public Map<String, Course> getCourses() {
        return cm.findCourses();
    }

    public Course getTheCourse() {
        return theCourse;
    }

    public String show(String n) {
        theCourse = cm.findCourse(n);
        System.out.println(n);
        return "showCourse";
    }

    public String save() {
        cm.saveCourse(theCourse);
        return "showCourse";
    }

    public String newCourse() {
        theCourse = new Course();
        return "editCourse";
    }
}
