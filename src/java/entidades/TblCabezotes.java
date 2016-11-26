/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_cabezotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCabezotes.findAll", query = "SELECT t FROM TblCabezotes t"),
    @NamedQuery(name = "TblCabezotes.findByIdCabezote", query = "SELECT t FROM TblCabezotes t WHERE t.idCabezote = :idCabezote"),
    @NamedQuery(name = "TblCabezotes.findByPlacaCabezote", query = "SELECT t FROM TblCabezotes t WHERE t.placaCabezote = :placaCabezote"),
    @NamedQuery(name = "TblCabezotes.findByTipoCabezote", query = "SELECT t FROM TblCabezotes t WHERE t.tipoCabezote = :tipoCabezote"),
    @NamedQuery(name = "TblCabezotes.findByCondicionCabezote", query = "SELECT t FROM TblCabezotes t WHERE t.condicionCabezote = :condicionCabezote"),
    @NamedQuery(name = "TblCabezotes.findByEstadoCabezote", query = "SELECT t FROM TblCabezotes t WHERE t.estadoCabezote = :estadoCabezote")})
public class TblCabezotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cabezote")
    private Integer idCabezote;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "placa_cabezote")
    private String placaCabezote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_cabezote")
    private boolean tipoCabezote;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "condicion_cabezote")
    private String condicionCabezote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_cabezote")
    private boolean estadoCabezote;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCabezote")
    private Collection<TblCarrotanques> tblCarrotanquesCollection;

    public TblCabezotes() {
    }

    public TblCabezotes(Integer idCabezote) {
        this.idCabezote = idCabezote;
    }

    public TblCabezotes(Integer idCabezote, String placaCabezote, boolean tipoCabezote, String condicionCabezote, boolean estadoCabezote) {
        this.idCabezote = idCabezote;
        this.placaCabezote = placaCabezote;
        this.tipoCabezote = tipoCabezote;
        this.condicionCabezote = condicionCabezote;
        this.estadoCabezote = estadoCabezote;
    }

    public Integer getIdCabezote() {
        return idCabezote;
    }

    public void setIdCabezote(Integer idCabezote) {
        this.idCabezote = idCabezote;
    }

    public String getPlacaCabezote() {
        return placaCabezote;
    }

    public void setPlacaCabezote(String placaCabezote) {
        this.placaCabezote = placaCabezote;
    }

    public boolean getTipoCabezote() {
        return tipoCabezote;
    }

    public void setTipoCabezote(boolean tipoCabezote) {
        this.tipoCabezote = tipoCabezote;
    }

    public String getCondicionCabezote() {
        return condicionCabezote;
    }

    public void setCondicionCabezote(String condicionCabezote) {
        this.condicionCabezote = condicionCabezote;
    }

    public boolean getEstadoCabezote() {
        return estadoCabezote;
    }

    public void setEstadoCabezote(boolean estadoCabezote) {
        this.estadoCabezote = estadoCabezote;
    }

    @XmlTransient
    public Collection<TblCarrotanques> getTblCarrotanquesCollection() {
        return tblCarrotanquesCollection;
    }

    public void setTblCarrotanquesCollection(Collection<TblCarrotanques> tblCarrotanquesCollection) {
        this.tblCarrotanquesCollection = tblCarrotanquesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCabezote != null ? idCabezote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCabezotes)) {
            return false;
        }
        TblCabezotes other = (TblCabezotes) object;
        if ((this.idCabezote == null && other.idCabezote != null) || (this.idCabezote != null && !this.idCabezote.equals(other.idCabezote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblCabezotes[ idCabezote=" + idCabezote + " ]";
    }
    
}
