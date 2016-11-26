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
import javax.persistence.Lob;
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
@Table(name = "programacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programacion.findAll", query = "SELECT p FROM Programacion p"),
    @NamedQuery(name = "Programacion.findByIdProgramacion", query = "SELECT p FROM Programacion p WHERE p.idProgramacion = :idProgramacion"),
    @NamedQuery(name = "Programacion.findByIdPlan", query = "SELECT p FROM Programacion p WHERE p.idPlan = :idPlan"),
    @NamedQuery(name = "Programacion.findByNomProducto", query = "SELECT p FROM Programacion p WHERE p.nomProducto = :nomProducto"),
    @NamedQuery(name = "Programacion.findByVolumenNominado", query = "SELECT p FROM Programacion p WHERE p.volumenNominado = :volumenNominado"),
    @NamedQuery(name = "Programacion.findByOrigen", query = "SELECT p FROM Programacion p WHERE p.origen = :origen"),
    @NamedQuery(name = "Programacion.findByDestino", query = "SELECT p FROM Programacion p WHERE p.destino = :destino"),
    @NamedQuery(name = "Programacion.findByNomEmpresa", query = "SELECT p FROM Programacion p WHERE p.nomEmpresa = :nomEmpresa")})
public class Programacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_programacion")
    @Id
    private int idProgramacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_plan")
    private int idPlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "nom_producto")
    private String nomProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "volumen_nominado")
    private double volumenNominado;
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

    public Programacion() {
    }

    public int getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(int idProgramacion) {
        this.idProgramacion = idProgramacion;
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

    public double getVolumenNominado() {
        return volumenNominado;
    }

    public void setVolumenNominado(double volumenNominado) {
        this.volumenNominado = volumenNominado;
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
