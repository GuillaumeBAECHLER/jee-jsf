/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ejb.Stateless;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Guillaume
 */

@Stateless
public class CourseManager {

    private Map<String,Course> listeCourses;

    public CourseManager() {
        listeCourses = new HashMap();
    }

    public Map<String,Course> findCourses() {
        return listeCourses;
    }

    public Course findCourse(String n) {
        return listeCourses.get(n);
    }

    public Course saveCourse(Course c) {
        if(c.getId() == null){
            c.setId(UUID.randomUUID().toString());
        }
        listeCourses.put(c.getId(), c);
        return c;
    }

    public void deleteCourse(Course c) {
        listeCourses.remove(c.getId(), c);
    }
}
