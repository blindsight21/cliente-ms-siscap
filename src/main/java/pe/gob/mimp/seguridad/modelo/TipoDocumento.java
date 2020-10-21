/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author desarrollador
 */
@Entity
@Table(name = "TIPO_DOCUMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDocumento.findAll", query = "SELECT t FROM TipoDocumento t"),
    @NamedQuery(name = "TipoDocumento.findByNidTipoDocumento", query = "SELECT t FROM TipoDocumento t WHERE t.nidTipoDocumento = :nidTipoDocumento"),
    @NamedQuery(name = "TipoDocumento.findByTxtDescripcion", query = "SELECT t FROM TipoDocumento t WHERE t.txtDescripcion = :txtDescripcion"),
    @NamedQuery(name = "TipoDocumento.findByFlgActivo", query = "SELECT t FROM TipoDocumento t WHERE t.flgActivo = :flgActivo"),
    @NamedQuery(name = "TipoDocumento.findByTxtPc", query = "SELECT t FROM TipoDocumento t WHERE t.txtPc = :txtPc"),
    @NamedQuery(name = "TipoDocumento.findByTxtIp", query = "SELECT t FROM TipoDocumento t WHERE t.txtIp = :txtIp"),
    @NamedQuery(name = "TipoDocumento.findByFecEdicion", query = "SELECT t FROM TipoDocumento t WHERE t.fecEdicion = :fecEdicion")})
public class TipoDocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "SQ_TIPO_DOCUMENTO", sequenceName = "SQ_TIPO_DOCUMENTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TIPO_DOCUMENTO")
    @Column(name = "NID_TIPO_DOCUMENTO")
    private BigDecimal nidTipoDocumento;
//    @Size(max = 20)
    @Column(name = "TXT_DESCRIPCION")
    private String txtDescripcion;
    @Column(name = "FLG_ACTIVO")
    private BigInteger flgActivo;
//    @Size(max = 50)
    @Column(name = "TXT_PC")
    private String txtPc;
//    @Size(max = 20)
    @Column(name = "TXT_IP")
    private String txtIp;
    @Column(name = "FEC_EDICION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecEdicion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDocumento", fetch = FetchType.LAZY)
    private List<Persona> personaList;
    @JoinColumn(name = "NID_USUARIO", referencedColumnName = "NID_USUARIO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public TipoDocumento() {
    }

    public TipoDocumento(BigDecimal nidTipoDocumento) {
        this.nidTipoDocumento = nidTipoDocumento;
    }

    public BigDecimal getNidTipoDocumento() {
        return nidTipoDocumento;
    }

    public void setNidTipoDocumento(BigDecimal nidTipoDocumento) {
        this.nidTipoDocumento = nidTipoDocumento;
    }

    public String getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
    }

    public String getTxtPc() {
        return txtPc;
    }

    public void setTxtPc(String txtPc) {
        this.txtPc = txtPc;
    }

    public String getTxtIp() {
        return txtIp;
    }

    public void setTxtIp(String txtIp) {
        this.txtIp = txtIp;
    }

    public Date getFecEdicion() {
        return fecEdicion;
    }

    public void setFecEdicion(Date fecEdicion) {
        this.fecEdicion = fecEdicion;
    }

    @XmlTransient
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidTipoDocumento != null ? nidTipoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumento)) {
            return false;
        }
        TipoDocumento other = (TipoDocumento) object;
        if ((this.nidTipoDocumento == null && other.nidTipoDocumento != null) || (this.nidTipoDocumento != null && !this.nidTipoDocumento.equals(other.nidTipoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.seguridad.modelo.TipoDocumento[ nidTipoDocumento=" + nidTipoDocumento + " ]";
    }
    
}
