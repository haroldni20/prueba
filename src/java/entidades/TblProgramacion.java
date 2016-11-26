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
@Table(name = "tbl_programacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblProgramacion.findAll", query = "SELECT t FROM TblProgramacion t"),
    @NamedQuery(name = "TblProgramacion.findByIdProgramacion", query = "SELECT t FROM TblProgramacion t WHERE t.idProgramacion = :idProgramacion"),
    @NamedQuery(name = "TblProgramacion.findByVolumenNominado", query = "SELECT t FROM TblProgramacion t WHERE t.volumenNominado = :volumenNominado"),
    @NamedQuery(name = "TblProgramacion.findByFechaIni", query = "SELECT t FROM TblProgramacion t WHERE t.fechaIni = :fechaIni"),
    @NamedQuery(name = "TblProgramacion.findByHoraIni", query = "SELECT t FROM TblProgramacion t WHERE t.horaIni = :horaIni")})
public class TblProgramacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_programacion")
    private Integer idProgramacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "volumen_nominado")
    private double volumenNominado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ini")
    @Temporal(TemporalType.DATE)
    private Date fechaIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_ini")
    @Temporal(TemporalType.TIME)
    private Date horaIni;
    @Lob
    @Size(max = 65535)
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "id_plan", referencedColumnName = "id_plan")
    @ManyToOne(optional = false)
    private TblPlan idPlan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProgramacion")
    private Collection<TblServicio> tblServicioCollection;

    public TblProgramacion() {
    }

    public TblProgramacion(Integer idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public TblProgramacion(Integer idProgramacion, double volumenNominado, Date fechaIni, Date horaIni) {
        this.idProgramacion = idProgramacion;
        this.volumenNominado = volumenNominado;
        this.fechaIni = fechaIni;
        this.horaIni = horaIni;
    }

    public Integer getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(Integer idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public double getVolumenNominado() {
        return volumenNominado;
    }

    public void setVolumenNominado(double volumenNominado) {
        this.volumenNominado = volumenNominado;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Date horaIni) {
        this.horaIni = horaIni;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public TblPlan getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(TblPlan idPlan) {
        this.idPlan = idPlan;
    }

    @XmlTransient
    public Collection<TblServicio> getTblServicioCollection() {
        return tblServicioCollection;
    }

    public void setTblServicioCollection(Collection<TblServicio> tblServicioCollection) {
        this.tblServicioCollection = tblServicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProgramacion != null ? idProgramacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProgramacion)) {
            return false;
        }
        TblProgramacion other = (TblProgramacion) object;
        if ((this.idProgramacion == null && other.idProgramacion != null) || (this.idProgramacion != null && !this.idProgramacion.equals(other.idProgramacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblProgramacion[ idProgramacion=" + idProgramacion + " ]";
    }
    
}
