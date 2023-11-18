// Usuario.java
package com.miempresa.LAB;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Date;

public class Usuario {

    @NotNull(message = "El tipo de documento no puede ser nulo")
    private DocumentoTipo tipoDocumento;

    @NotBlank(message = "El número de documento no puede estar en blanco")
    private String numeroDocumento;

    @NotBlank(message = "El apellido paterno no puede estar en blanco")
    private String apellidoPaterno;

    private String apellidoMaterno;

    @NotBlank(message = "Los nombres no pueden estar en blanco")
    private String nombres;

    @NotNull(message = "La fecha de nacimiento no puede ser nula")
    private Date fechaNacimiento;

    @NotNull(message = "El sexo no puede ser nulo")
    private Sexo sexo;

    @NotNull(message = "El estado civil no puede ser nulo")
    private EstadoCivil estadoCivil;

    @NotNull(message = "La situación laboral no puede ser nula")
    private SituacionLaboral situacionLaboral;

    @NotBlank(message = "El RUC del empleador no puede estar en blanco")
    @Pattern(regexp = "\\d{11}", message = "El RUC del empleador debe tener 11 dígitos")
    private String rucEmpleador;

    @AssertTrue(message = "Debes aceptar los términos y condiciones")
    private boolean aceptaTerminosYCondiciones;

    // Getters y setters

    public DocumentoTipo getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(DocumentoTipo tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public SituacionLaboral getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public String getRucEmpleador() {
        return rucEmpleador;
    }

    public void setRucEmpleador(String rucEmpleador) {
        this.rucEmpleador = rucEmpleador;
    }

    public boolean isAceptaTerminosYCondiciones() {
        return aceptaTerminosYCondiciones;
    }

    public void setAceptaTerminosYCondiciones(boolean aceptaTerminosYCondiciones) {
        this.aceptaTerminosYCondiciones = aceptaTerminosYCondiciones;
    }

    // Método personalizado para la lógica relacionada con "Solicitar nueva Tarjeta"
    public void solicitarNuevaTarjeta() {
        // Lógica para solicitar una nueva tarjeta
    }
}
