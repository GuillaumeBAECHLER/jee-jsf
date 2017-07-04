/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Guillaume
 */
@Named(value = "counter")
@ManagedBean
@SessionScoped
public class Counter implements Serializable {
    
    private static final long serialVersionUID = 3L;
    
    Integer value = 1000;
    
    /**
     * Creates a new instance of Counter
     */
    public Counter() {
    }
    
    public String inc() {
        value++;
        return null; // ne pas se déplacer
    }
    
    public Integer getValue() {
        return value;
    }
    
}
