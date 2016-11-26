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
@Table(name = "tbl_tanque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTanque.findAll", query = "SELECT t FROM TblTanque t"),
    @NamedQuery(name = "TblTanque.findByIdTanque", query = "SELECT t FROM TblTanque t WHERE t.idTanque = :idTanque"),
    @NamedQuery(name = "TblTanque.findByPlacaTanque", query = "SELECT t FROM TblTanque t WHERE t.placaTanque = :placaTanque"),
    @NamedQuery(name = "TblTanque.findByCapacidad", query = "SELECT t FROM TblTanque t WHERE t.capacidad = :capacidad"),
    @NamedQuery(name = "TblTanque.findByCondicionTanque", query = "SELECT t FROM TblTanque t WHERE t.condicionTanque = :condicionTanque"),
    @NamedQuery(name = "TblTanque.findByEstadoTanque", query = "SELECT t FROM TblTanque t WHERE t.estadoTanque = :estadoTanque")})
public class TblTanque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tanque")
    private Integer idTanque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "placa_tanque")
    private int placaTanque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad")
    private double capacidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "condicion_tanque")
    private String condicionTanque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_tanque")
    private boolean estadoTanque;

    public TblTanque() {
    }

    public TblTanque(Integer idTanque) {
        this.idTanque = idTanque;
    }

    public TblTanque(Integer idTanque, int placaTanque, double capacidad, String condicionTanque, boolean estadoTanque) {
        this.idTanque = idTanque;
        this.placaTanque = placaTanque;
        this.capacidad = capacidad;
        this.condicionTanque = condicionTanque;
        this.estadoTanque = estadoTanque;
    }

    public Integer getIdTanque() {
        return idTanque;
    }

    public void setIdTanque(Integer idTanque) {
        this.idTanque = idTanque;
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

    public String getCondicionTanque() {
        return condicionTanque;
    }

    public void setCondicionTanque(String condicionTanque) {
        this.condicionTanque = condicionTanque;
    }

    public boolean getEstadoTanque() {
        return estadoTanque;
    }

    public void setEstadoTanque(boolean estadoTanque) {
        this.estadoTanque = estadoTanque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTanque != null ? idTanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTanque)) {
            return false;
        }
        TblTanque other = (TblTanque) object;
        if ((this.idTanque == null && other.idTanque != null) || (this.idTanque != null && !this.idTanque.equals(other.idTanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblTanque[ idTanque=" + idTanque + " ]";
    }
    
}
