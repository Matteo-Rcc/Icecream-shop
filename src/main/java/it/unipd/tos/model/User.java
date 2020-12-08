package it.unipd.tos.model;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate nascita;

    /* COSTRUTTORE */
    public User(int i, String n, LocalDate d) {
        id = i; name = n; nascita = d;
    }
    
    /* RITORNA IL NOME */
    public String getName() {
        return name;
    }
    
    /* RITORNA L'ID */
    public int getId() {
        return id;
    }

    /* RITORNA LA DATA DI NASCITA */
    public LocalDate getDate() {
        return nascita;
    }
}