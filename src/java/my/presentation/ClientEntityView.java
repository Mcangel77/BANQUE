/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.ClientEntityFacade;
import entities.ClientEntity;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Nick Angel AYUFACK
 */
@Named(value = "ClientEntityView")
@RequestScoped
public class ClientEntityView {

    @EJB
    private ClientEntityFacade clientEntityFacade;
    // Creates a new field
    private ClientEntity client;
    private final ClientEntity clientEntity;
    /**
     * Creates a new instance of ClientEntityView
     */
    public ClientEntityView() {
       this.clientEntity = new ClientEntity();
    }

    // Calls getMessage to retrieve the message
    public ClientEntity getClientEntity() {
       return clientEntity;
    }

    // Returns the total number of messages
    public int getNumberOfClientEntity(){
       return clientEntityFacade.findAll().size();
    }

    // Saves the message and then returns the string "theend"
    public String postClientEntity(){
       this.clientEntityFacade.create(clientEntity);
       return "theend";
    }
    public List<ClientEntity> listClient()
    {
        return clientEntityFacade.findAll();
    }
}
