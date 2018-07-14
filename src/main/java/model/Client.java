package model;

import javax.persistence.Column;
import javax.persistence.criteria.CriteriaBuilder;

public class Client {


    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "imię")
    private String name;
    @Column(name = "adres")
    private String adress;
    @Column(name = "NIP")
    private Integer nip;
    @Column(name = "PESEL")
    private Integer pesel;
}
