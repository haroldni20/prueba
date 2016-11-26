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
@Table(name = "servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s"),
    @NamedQuery(name = "Servicio.findByIdGuia", query = "SELECT s FROM Servicio s WHERE s.idGuia = :idGuia"),
    @NamedQuery(name = "Servicio.findByIdProgramacion", query = "SELECT s FROM Servicio s WHERE s.idProgramacion = :idProgramacion"),
    @NamedQuery(name = "Servicio.findByNumSello", query = "SELECT s FROM Servicio s WHERE s.numSello = :numSello"),
    @NamedQuery(name = "Servicio.findByNomProducto", query = "SELECT s FROM Servicio s WHERE s.nomProducto = :nomProducto"),
    @NamedQuery(name = "Servicio.findByFechaCargue", query = "SELECT s FROM Servicio s WHERE s.fechaCargue = :fechaCargue"),
    @NamedQuery(name = "Servicio.findByHoraCargue", query = "SELECT s FROM Servicio s WHERE s.horaCargue = :horaCargue"),
    @NamedQuery(name = "Servicio.findByFechaDescargue", query = "SELECT s FROM Servicio s WHERE s.fechaDescargue = :fechaDescargue"),
    @NamedQuery(name = "Servicio.findByHoraDescargue", query = "SELECT s FROM Servicio s WHERE s.horaDescargue = :horaDescargue"),
    @NamedQuery(name = "Servicio.findByBrrlsBrutosCarga", query = "SELECT s FROM Servicio s WHERE s.brrlsBrutosCarga = :brrlsBrutosCarga"),
    @NamedQuery(name = "Servicio.findByBrrlsNetosCarga", query = "SELECT s FROM Servicio s WHERE s.brrlsNetosCarga = :brrlsNetosCarga"),
    @NamedQuery(name = "Servicio.findByBrrlsBrutosDescarga", query = "SELECT s FROM Servicio s WHERE s.brrlsBrutosDescarga = :brrlsBrutosDescarga"),
    @NamedQuery(name = "Servicio.findByBrrlsNetosDescarga", query = "SELECT s FROM Servicio s WHERE s.brrlsNetosDescarga = :brrlsNetosDescarga"),
    @NamedQuery(name = "Servicio.findByIdIdentificacion", query = "SELECT s FROM Servicio s WHERE s.idIdentificacion = :idIdentificacion"),
    @NamedQuery(name = "Servicio.findByNombre", query = "SELECT s FROM Servicio s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Servicio.findByApellido", query = "SELECT s FROM Servicio s WHERE s.apellido = :apellido"),
    @NamedQuery(name = "Servicio.findByCelular", query = "SELECT s FROM Servicio s WHERE s.celular = :celular")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_guia")
    @Id
    private int idGuia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_programacion")
    private int idProgramacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "num_sello")
    private String numSello;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "nom_producto")
    private String nomProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cargue")
    @Temporal(TemporalType.DATE)
    private Date fechaCargue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_cargue")
    @Temporal(TemporalType.TIME)
    private Date horaCargue;
    @Column(name = "fecha_descargue")
    @Temporal(TemporalType.DATE)
    private Date fechaDescargue;
    @Column(name = "hora_descargue")
    @Temporal(TemporalType.TIME)
    private Date horaDescargue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "brrls_brutos_carga")
    private double brrlsBrutosCarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "brrls_netos_carga")
    private double brrlsNetosCarga;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "brrls_brutos_descarga")
    private Double brrlsBrutosDescarga;
    @Column(name = "brrls_netos_descarga")
    private Double brrlsNetosDescarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_identificacion")
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
    @Size(max = 12)
    @Column(name = "celular")
    private String celular;

    public Servicio() {
    }

    public int getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(int idGuia) {
        this.idGuia = idGuia;
    }

    public int getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(int idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public String getNumSello() {
        return numSello;
    }

    public void setNumSello(String numSello) {
        this.numSello = numSello;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Date getFechaCargue() {
        return fechaCargue;
    }

    public void setFechaCargue(Date fechaCargue) {
        this.fechaCargue = fechaCargue;
    }

    public Date getHoraCargue() {
        return horaCargue;
    }

    public void setHoraCargue(Date horaCargue) {
        this.horaCargue = horaCargue;
    }

    public Date getFechaDescargue() {
        return fechaDescargue;
    }

    public void setFechaDescargue(Date fechaDescargue) {
        this.fechaDescargue = fechaDescargue;
    }

    public Date getHoraDescargue() {
        return horaDescargue;
    }

    public void setHoraDescargue(Date horaDescargue) {
        this.horaDescargue = horaDescargue;
    }

    public double getBrrlsBrutosCarga() {
        return brrlsBrutosCarga;
    }

    public void setBrrlsBrutosCarga(double brrlsBrutosCarga) {
        this.brrlsBrutosCarga = brrlsBrutosCarga;
    }

    public double getBrrlsNetosCarga() {
        return brrlsNetosCarga;
    }

    public void setBrrlsNetosCarga(double brrlsNetosCarga) {
        this.brrlsNetosCarga = brrlsNetosCarga;
    }

    public Double getBrrlsBrutosDescarga() {
        return brrlsBrutosDescarga;
    }

    public void setBrrlsBrutosDescarga(Double brrlsBrutosDescarga) {
        this.brrlsBrutosDescarga = brrlsBrutosDescarga;
    }

    public Double getBrrlsNetosDescarga() {
        return brrlsNetosDescarga;
    }

    public void setBrrlsNetosDescarga(Double brrlsNetosDescarga) {
        this.brrlsNetosDescarga = brrlsNetosDescarga;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
