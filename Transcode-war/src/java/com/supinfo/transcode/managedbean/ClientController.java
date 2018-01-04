/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.transcode.managedbean;


import com.supinfo.transcode.entity.Client;
import com.supinfo.transcode.service.ClientService;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author matta
 */
@ManagedBean
public class ClientController {
    
    @EJB
    private ClientService clientService;
    
    private Client newClient = new Client();

    public Client getNewClient() {
        return newClient;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }
    
    public String addClient(){
        clientService.addClient(newClient);
        return "hello";
    }
    
}
