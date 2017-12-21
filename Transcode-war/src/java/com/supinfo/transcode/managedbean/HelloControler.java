/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.transcode.managedbean;

import com.supinfo.transcode.service.HelloService;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;



/**
 *
 * @author matta
 */
@ManagedBean
public class HelloControler {
    
    @EJB
    private HelloService helloService;
            
    
    public String sayHello(){
        return helloService.getHelloMessage();
    }
    
}
