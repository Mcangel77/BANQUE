/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import entities.ClientEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nick Angel AYUFACK
 */
@Stateless
public class ClientEntityFacade extends AbstractFacade<ClientEntity> {

    @PersistenceContext(unitName = "AN_AA_BanquePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientEntityFacade() {
        super(ClientEntity.class);
    }
    
}
