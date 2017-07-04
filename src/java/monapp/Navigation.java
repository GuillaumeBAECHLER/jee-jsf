/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Guillaume
 */
@Named(value = "navigation")
@ManagedBean
@SessionScoped
public class Navigation implements Serializable {

    /**
     * Creates a new instance of Navigation
     */
    public Navigation() {
    }

    public String hello() {
        return "hello";
    }
}
