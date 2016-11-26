/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "planeacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planeacion.findAll", query = "SELECT p FROM Planeacion p"),
    @NamedQuery(name = "Planeacion.findByIdPlan", query = "SELECT p FROM Planeacion p WHERE p.idPlan = :idPlan"),
    @NamedQuery(name = "Planeacion.findByNomProducto", query = "SELECT p FROM Planeacion p WHERE p.nomProducto = :nomProducto"),
    @NamedQuery(name = "Planeacion.findByVolPromedio", query = "SELECT p FROM Planeacion p WHERE p.volPromedio = :volPromedio"),
    @NamedQuery(name = "Planeacion.findByFechaCreacion", query = "SELECT p FROM Planeacion p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Planeacion.findByVigencia", query = "SELECT p FROM Planeacion p WHERE p.vigencia = :vigencia"),
    @NamedQuery(name = "Planeacion.findByOrigen", query = "SELECT p FROM Planeacion p WHERE p.origen = :origen"),
    @NamedQuery(name = "Planeacion.findByDestino", query = "SELECT p FROM Planeacion p WHERE p.destino = :destino"),
    @NamedQuery(name = "Planeacion.findByNomEmpresa", query = "SELECT p FROM Planeacion p WHERE p.nomEmpresa = :nomEmpresa")})
public class Planeacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_plan")
    @Id
    private int idPlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "nom_producto")
    private String nomProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vol_promedio")
    private double volPromedio;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "origen")
    private String origen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "destino")
    private String destino;
    @Size(max = 32)
    @Column(name = "nom_empresa")
    private String nomEmpresa;

    public Planeacion() {
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public double getVolPromedio() {
        return volPromedio;
    }

    public void setVolPromedio(double volPromedio) {
        this.volPromedio = volPromedio;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }
    
}
