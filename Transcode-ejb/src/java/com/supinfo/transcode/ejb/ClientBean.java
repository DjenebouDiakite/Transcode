/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.transcode.ejb;

import com.supinfo.transcode.entity.Client;
import com.supinfo.transcode.service.ClientService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author matta
 */
public class ClientBean implements ClientService{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Client addClient(Client client) {
        em.persist(client);
        return client;  
    }
    
    
}
