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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_carrotanques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCarrotanques.findAll", query = "SELECT t FROM TblCarrotanques t"),
    @NamedQuery(name = "TblCarrotanques.findByIdCarrotanque", query = "SELECT t FROM TblCarrotanques t WHERE t.idCarrotanque = :idCarrotanque"),
    @NamedQuery(name = "TblCarrotanques.findByTipo", query = "SELECT t FROM TblCarrotanques t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "TblCarrotanques.findByIdTanque", query = "SELECT t FROM TblCarrotanques t WHERE t.idTanque = :idTanque")})
public class TblCarrotanques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_carrotanque")
    private Integer idCarrotanque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private boolean tipo;
    @Column(name = "id_tanque")
    private Integer idTanque;
    @JoinColumn(name = "id_cabezote", referencedColumnName = "id_cabezote")
    @ManyToOne(optional = false)
    private TblCabezotes idCabezote;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    @ManyToOne(optional = false)
    private TblEmpresaTransportadora idEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrotanque")
    private Collection<TblServicio> tblServicioCollection;

    public TblCarrotanques() {
    }

    public TblCarrotanques(Integer idCarrotanque) {
        this.idCarrotanque = idCarrotanque;
    }

    public TblCarrotanques(Integer idCarrotanque, boolean tipo) {
        this.idCarrotanque = idCarrotanque;
        this.tipo = tipo;
    }

    public Integer getIdCarrotanque() {
        return idCarrotanque;
    }

    public void setIdCarrotanque(Integer idCarrotanque) {
        this.idCarrotanque = idCarrotanque;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public Integer getIdTanque() {
        return idTanque;
    }

    public void setIdTanque(Integer idTanque) {
        this.idTanque = idTanque;
    }

    public TblCabezotes getIdCabezote() {
        return idCabezote;
    }

    public void setIdCabezote(TblCabezotes idCabezote) {
        this.idCabezote = idCabezote;
    }

    public TblEmpresaTransportadora getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresaTransportadora idEmpresa) {
        this.idEmpresa = idEmpresa;
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
        hash += (idCarrotanque != null ? idCarrotanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCarrotanques)) {
            return false;
        }
        TblCarrotanques other = (TblCarrotanques) object;
        if ((this.idCarrotanque == null && other.idCarrotanque != null) || (this.idCarrotanque != null && !this.idCarrotanque.equals(other.idCarrotanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblCarrotanques[ idCarrotanque=" + idCarrotanque + " ]";
    }
    
}
