/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.transcode.service;

import com.supinfo.transcode.entity.Client;
import javax.ejb.Remote;

/**
 *
 * @author matta
 */
@Remote
public interface ClientService {
    
    public Client addClient(Client client);
    
}
