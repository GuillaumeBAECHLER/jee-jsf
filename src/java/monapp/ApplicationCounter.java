/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Guillaume
 */
@ManagedBean
@ApplicationScoped
public class ApplicationCounter implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    int value = 0;

    public int getCounter() {
        return ++value;
    }
    
    public int nextValue(){
        return value + 1;
    }
    
    @PostConstruct
    void init() {
        System.err.println("Create " + this);
    }

    @PreDestroy
    void close() {
        System.err.println("Close " + this);
    }
}
