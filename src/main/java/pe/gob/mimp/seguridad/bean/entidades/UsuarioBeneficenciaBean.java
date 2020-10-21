/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.bean.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import pe.gob.mimp.util.FormatoFechaConstante;

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Copyright (C) 2018 Ministerio de la Mujer y Poblaciones Vulnerables (Lima -
 * Peru) DIRECCION GENERAL DE FAMILIA Y COMUNIDAD DIRECCION DE BENEFICENCIA
 * PUBLICAS PROYECTO SISBEN
 *
 * All rights reserved. Used by permission This software is the confidential and
 * proprietary information of MIMP ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with MIMP.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 */
/**
 * @objetivo: Clase Entidad UsuarioBeneficencia que permite la relación entre
 * Usuario y Beneficencia
 * @autor: Ing. Oscar Mateo
 * @fecha: 01/03/2018
 *
 * ------------------------------------------------------------------------
 * Modificaciones Fecha Nombre Descripción
 * ------------------------------------------------------------------------
 *
 */
public class UsuarioBeneficenciaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long usuarioBeneficenciaId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UsuarioBean usuarioBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long beneficenciaId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer activo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long usuarioRegistroId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date fechaRegistro;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long usuarioEdicionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fechaEdicion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pc;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String direccionIp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nombreSociedadBeneficencia;

    public Long getUsuarioBeneficenciaId() {
        return usuarioBeneficenciaId;
    }

    public void setUsuarioBeneficenciaId(Long usuarioBeneficenciaId) {
        this.usuarioBeneficenciaId = usuarioBeneficenciaId;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public Long getBeneficenciaId() {
        return beneficenciaId;
    }

    public void setBeneficenciaId(Long beneficenciaId) {
        this.beneficenciaId = beneficenciaId;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Long getUsuarioRegistroId() {
        return usuarioRegistroId;
    }

    public void setUsuarioRegistroId(Long usuarioRegistroId) {
        this.usuarioRegistroId = usuarioRegistroId;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Long getUsuarioEdicionId() {
        return usuarioEdicionId;
    }

    public void setUsuarioEdicionId(Long usuarioEdicionId) {
        this.usuarioEdicionId = usuarioEdicionId;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getNombreSociedadBeneficencia() {
        return nombreSociedadBeneficencia;
    }

    public void setNombreSociedadBeneficencia(String nombreSociedadBeneficencia) {
        this.nombreSociedadBeneficencia = nombreSociedadBeneficencia;
    }

}
