/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LuisAngel
 */
@Entity
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findByDoc", query = "SELECT s FROM Student s WHERE s.doc = :doc")
    , @NamedQuery(name = "Student.findByNombreCompleto", query = "SELECT s FROM Student s WHERE s.nombreCompleto = :nombreCompleto")
    , @NamedQuery(name = "Student.findByTelefono", query = "SELECT s FROM Student s WHERE s.telefono = :telefono")
    , @NamedQuery(name = "Student.findByUsername", query = "SELECT s FROM Student s WHERE s.username = :username")
    , @NamedQuery(name = "Student.findByPassword", query = "SELECT s FROM Student s WHERE s.password = :password")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "doc")
    private String doc;
    @Size(max = 60)
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Size(max = 15)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 50)
    @Column(name = "username")
    private String username;
    @Size(max = 50)
    @Column(name = "password")
    private String password;

    public Student() {
    }

    public Student(String doc) {
        this.doc = doc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doc != null ? doc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.doc == null && other.doc != null) || (this.doc != null && !this.doc.equals(other.doc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entity.Student[ doc=" + doc + " ]";
    }
    
}
