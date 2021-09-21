package com.biblio.model;

public class Autor {
    private String autor_lastname;
    private String autor_firstname;

    public Autor(String autor_lastname) {
        this.autor_lastname = autor_lastname;
    }

    public Autor(String autor_lastname, String autor_firstname) {
        this.autor_lastname = autor_lastname;
        this.autor_firstname = autor_firstname;
    }

    public String getAutor_lastname() {
        return autor_lastname;
    }

    public void setAutor_lastname(String autor_lastname) {
        this.autor_lastname = autor_lastname;
    }

    public String getAutor_firstname() {
        return autor_firstname;
    }

    public void setAutor_firstname(String autor_firstname) {
        this.autor_firstname = autor_firstname;
    }
}
