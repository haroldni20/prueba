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
@Table(name = "tbl_conductores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblConductores.findAll", query = "SELECT t FROM TblConductores t"),
    @NamedQuery(name = "TblConductores.findByIdIdentificacion", query = "SELECT t FROM TblConductores t WHERE t.idIdentificacion = :idIdentificacion"),
    @NamedQuery(name = "TblConductores.findByTipoDocumentoId", query = "SELECT t FROM TblConductores t WHERE t.tipoDocumentoId = :tipoDocumentoId"),
    @NamedQuery(name = "TblConductores.findByNombre", query = "SELECT t FROM TblConductores t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TblConductores.findByApellido", query = "SELECT t FROM TblConductores t WHERE t.apellido = :apellido"),
    @NamedQuery(name = "TblConductores.findByCelular", query = "SELECT t FROM TblConductores t WHERE t.celular = :celular")})
public class TblConductores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_identificacion")
    private Integer idIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_documento_id")
    private int tipoDocumentoId;
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
    @Size(max = 12)
    @Column(name = "celular")
    private String celular;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idIdentificacion")
    private Collection<TblServicio> tblServicioCollection;

    public TblConductores() {
    }

    public TblConductores(Integer idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    public TblConductores(Integer idIdentificacion, int tipoDocumentoId, String nombre, String apellido) {
        this.idIdentificacion = idIdentificacion;
        this.tipoDocumentoId = tipoDocumentoId;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getIdIdentificacion() {
        return idIdentificacion;
    }

    public void setIdIdentificacion(Integer idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    public int getTipoDocumentoId() {
        return tipoDocumentoId;
    }

    public void setTipoDocumentoId(int tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
        hash += (idIdentificacion != null ? idIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblConductores)) {
            return false;
        }
        TblConductores other = (TblConductores) object;
        if ((this.idIdentificacion == null && other.idIdentificacion != null) || (this.idIdentificacion != null && !this.idIdentificacion.equals(other.idIdentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblConductores[ idIdentificacion=" + idIdentificacion + " ]";
    }
    
}
