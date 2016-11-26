/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.sessions;

import entidades.TblEmpresaTransportadora;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class TblEmpresaTransportadoraFacade extends AbstractFacade<TblEmpresaTransportadora> {

    @PersistenceContext(unitName = "CrudClopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblEmpresaTransportadoraFacade() {
        super(TblEmpresaTransportadora.class);
    }
    
}
