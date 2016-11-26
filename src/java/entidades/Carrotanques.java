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
@Table(name = "carrotanques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrotanques.findAll", query = "SELECT c FROM Carrotanques c"),
    @NamedQuery(name = "Carrotanques.findByIdCarrotanque", query = "SELECT c FROM Carrotanques c WHERE c.idCarrotanque = :idCarrotanque"),
    @NamedQuery(name = "Carrotanques.findByPlacaCabezote", query = "SELECT c FROM Carrotanques c WHERE c.placaCabezote = :placaCabezote"),
    @NamedQuery(name = "Carrotanques.findByPlacaTanque", query = "SELECT c FROM Carrotanques c WHERE c.placaTanque = :placaTanque"),
    @NamedQuery(name = "Carrotanques.findByCapacidad", query = "SELECT c FROM Carrotanques c WHERE c.capacidad = :capacidad"),
    @NamedQuery(name = "Carrotanques.findByNomEmpresa", query = "SELECT c FROM Carrotanques c WHERE c.nomEmpresa = :nomEmpresa")})
public class Carrotanques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_carrotanque")
    @Id
    private int idCarrotanque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "placa_cabezote")
    private String placaCabezote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "placa_tanque")
    private int placaTanque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad")
    private double capacidad;
    @Size(max = 32)
    @Column(name = "nom_empresa")
    private String nomEmpresa;

    public Carrotanques() {
    }

    public int getIdCarrotanque() {
        return idCarrotanque;
    }

    public void setIdCarrotanque(int idCarrotanque) {
        this.idCarrotanque = idCarrotanque;
    }

    public String getPlacaCabezote() {
        return placaCabezote;
    }

    public void setPlacaCabezote(String placaCabezote) {
        this.placaCabezote = placaCabezote;
    }

    public int getPlacaTanque() {
        return placaTanque;
    }

    public void setPlacaTanque(int placaTanque) {
        this.placaTanque = placaTanque;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }
    
}
