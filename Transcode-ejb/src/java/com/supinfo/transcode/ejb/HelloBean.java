/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.transcode.ejb;

import com.supinfo.transcode.service.HelloService;
import javax.ejb.Stateless;

/**
 *
 * @author matta
 */
@Stateless
public class HelloBean implements HelloService {

    @Override
    public String getHelloMessage() {
        return "Salut toi !";
    }
    
}