/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "conductores_x_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConductoresXEmpresa.findAll", query = "SELECT c FROM ConductoresXEmpresa c"),
    @NamedQuery(name = "ConductoresXEmpresa.findByIdIdentificacion", query = "SELECT c FROM ConductoresXEmpresa c WHERE c.idIdentificacion = :idIdentificacion"),
    @NamedQuery(name = "ConductoresXEmpresa.findByNombre", query = "SELECT c FROM ConductoresXEmpresa c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "ConductoresXEmpresa.findByApellido", query = "SELECT c FROM ConductoresXEmpresa c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "ConductoresXEmpresa.findByNomEmpresa", query = "SELECT c FROM ConductoresXEmpresa c WHERE c.nomEmpresa = :nomEmpresa")})
public class ConductoresXEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_identificacion")
    @Id
    private int idIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 32)
    @Column(name = "nom_empresa")
    private String nomEmpresa;

    public ConductoresXEmpresa() {
    }

    public int getIdIdentificacion() {
        return idIdentificacion;
    }

    public void setIdIdentificacion(int idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }
    
}
