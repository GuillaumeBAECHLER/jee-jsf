/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

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

    private Map<Integer,Course> listeCourses;

    public CourseManager() {
        listeCourses = new HashMap();
    }

    public Map<Integer,Course> findCourses() {
        return listeCourses;
    }

    public Course findCourse(Integer n) {    
// a coder
        return null;
    }

    public Course saveCourse(Course c) {
        listeCourses.put(c.getId(), c);
        return c;
    }

    public void deleteCourse(Course c) {
        listeCourses.remove(c.getId(), c);
    }
}
