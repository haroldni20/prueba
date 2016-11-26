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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tbl_servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblServicio.findAll", query = "SELECT t FROM TblServicio t"),
    @NamedQuery(name = "TblServicio.findByIdGuia", query = "SELECT t FROM TblServicio t WHERE t.idGuia = :idGuia"),
    @NamedQuery(name = "TblServicio.findByNumSello", query = "SELECT t FROM TblServicio t WHERE t.numSello = :numSello"),
    @NamedQuery(name = "TblServicio.findByFechaCargue", query = "SELECT t FROM TblServicio t WHERE t.fechaCargue = :fechaCargue"),
    @NamedQuery(name = "TblServicio.findByHoraCargue", query = "SELECT t FROM TblServicio t WHERE t.horaCargue = :horaCargue"),
    @NamedQuery(name = "TblServicio.findByFechaDescargue", query = "SELECT t FROM TblServicio t WHERE t.fechaDescargue = :fechaDescargue"),
    @NamedQuery(name = "TblServicio.findByHoraDescargue", query = "SELECT t FROM TblServicio t WHERE t.horaDescargue = :horaDescargue"),
    @NamedQuery(name = "TblServicio.findByBrrlsBrutosCarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsBrutosCarga = :brrlsBrutosCarga"),
    @NamedQuery(name = "TblServicio.findByBrrlsNetosCarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsNetosCarga = :brrlsNetosCarga"),
    @NamedQuery(name = "TblServicio.findByBrrlsBrutosDescarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsBrutosDescarga = :brrlsBrutosDescarga"),
    @NamedQuery(name = "TblServicio.findByBrrlsNetosDescarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsNetosDescarga = :brrlsNetosDescarga")})
public class TblServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_guia")
    private Integer idGuia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "num_sello")
    private String numSello;
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
    @JoinColumn(name = "id_carrotanque", referencedColumnName = "id_carrotanque")
    @ManyToOne(optional = false)
    private TblCarrotanques idCarrotanque;
    @JoinColumn(name = "id_identificacion", referencedColumnName = "id_identificacion")
    @ManyToOne(optional = false)
    private TblConductores idIdentificacion;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private TblProducto idProducto;
    @JoinColumn(name = "id_programacion", referencedColumnName = "id_programacion")
    @ManyToOne(optional = false)
    private TblProgramacion idProgramacion;

    public TblServicio() {
    }

    public TblServicio(Integer idGuia) {
        this.idGuia = idGuia;
    }

    public TblServicio(Integer idGuia, String numSello, Date fechaCargue, Date horaCargue, double brrlsBrutosCarga, double brrlsNetosCarga) {
        this.idGuia = idGuia;
        this.numSello = numSello;
        this.fechaCargue = fechaCargue;
        this.horaCargue = horaCargue;
        this.brrlsBrutosCarga = brrlsBrutosCarga;
        this.brrlsNetosCarga = brrlsNetosCarga;
    }

    public Integer getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(Integer idGuia) {
        this.idGuia = idGuia;
    }

    public String getNumSello() {
        return numSello;
    }

    public void setNumSello(String numSello) {
        this.numSello = numSello;
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

    public TblCarrotanques getIdCarrotanque() {
        return idCarrotanque;
    }

    public void setIdCarrotanque(TblCarrotanques idCarrotanque) {
        this.idCarrotanque = idCarrotanque;
    }

    public TblConductores getIdIdentificacion() {
        return idIdentificacion;
    }

    public void setIdIdentificacion(TblConductores idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    public TblProducto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(TblProducto idProducto) {
        this.idProducto = idProducto;
    }

    public TblProgramacion getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(TblProgramacion idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGuia != null ? idGuia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblServicio)) {
            return false;
        }
        TblServicio other = (TblServicio) object;
        if ((this.idGuia == null && other.idGuia != null) || (this.idGuia != null && !this.idGuia.equals(other.idGuia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblServicio[ idGuia=" + idGuia + " ]";
    }
    
}
