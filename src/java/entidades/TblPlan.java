/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPlan.findAll", query = "SELECT t FROM TblPlan t"),
    @NamedQuery(name = "TblPlan.findByIdPlan", query = "SELECT t FROM TblPlan t WHERE t.idPlan = :idPlan"),
    @NamedQuery(name = "TblPlan.findByFechaCreacion", query = "SELECT t FROM TblPlan t WHERE t.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "TblPlan.findByVigencia", query = "SELECT t FROM TblPlan t WHERE t.vigencia = :vigencia")})
public class TblPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_plan")
    private Integer idPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vigencia")
    @Temporal(TemporalType.DATE)
    private Date vigencia;
    @Lob
    @Size(max = 65535)
    @Column(name = "observaciones")
    private String observaciones;
    @ManyToMany(mappedBy = "tblPlanCollection")
    private Collection<TblEmpresaTransportadora> tblEmpresaTransportadoraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan")
    private Collection<TblProgramacion> tblProgramacionCollection;
    @JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta")
    @ManyToOne(optional = false)
    private TblRuta idRuta;

    public TblPlan() {
    }

    public TblPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public TblPlan(Integer idPlan, Date fechaCreacion, Date vigencia) {
        this.idPlan = idPlan;
        this.fechaCreacion = fechaCreacion;
        this.vigencia = vigencia;
    }

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public Collection<TblEmpresaTransportadora> getTblEmpresaTransportadoraCollection() {
        return tblEmpresaTransportadoraCollection;
    }

    public void setTblEmpresaTransportadoraCollection(Collection<TblEmpresaTransportadora> tblEmpresaTransportadoraCollection) {
        this.tblEmpresaTransportadoraCollection = tblEmpresaTransportadoraCollection;
    }

    @XmlTransient
    public Collection<TblProgramacion> getTblProgramacionCollection() {
        return tblProgramacionCollection;
    }

    public void setTblProgramacionCollection(Collection<TblProgramacion> tblProgramacionCollection) {
        this.tblProgramacionCollection = tblProgramacionCollection;
    }

    public TblRuta getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(TblRuta idRuta) {
        this.idRuta = idRuta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPlan)) {
            return false;
        }
        TblPlan other = (TblPlan) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblPlan[ idPlan=" + idPlan + " ]";
    }
    
}
