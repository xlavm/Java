package com.flotataxis.modelo;

/**
 *
 * @author Luis Angel
 */
public class Estudiante {

    private String identificacion;
    private String nombres;
    private String apellidos;
    private String programaAcademico;
    private double promedioAcumulado;

    public Estudiante() {
    }

    public Estudiante(String identificacion, String nombres, String apellidos, String programaAcademico, double promedioAcumulado) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.programaAcademico = programaAcademico;
        this.promedioAcumulado = promedioAcumulado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

  /*  @Override
    public String toString() {
        return "Estudiante{" +
                "identificacion='" + identificacion + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", programaAcademico='" + programaAcademico + '\'' +
                ", promedioAcumulado=" + promedioAcumulado +
                '}';
    }
*/
    public enum programaAcademico {ING_SISTEMAS, ING_INDUSTRIAL, ING_ELECTRONICA, ING_SANITARIA}
}
