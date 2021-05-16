package com.giovanebmr.citiesapi.countrie;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Country")
@Table(name="pais")
public class Country {

    @Id
    private Long id;

    @Column(name="nome")
    private String name;

    @Column(name="nome_pt")
    private String namePt;

    @Column(name="sigla")
    private String sigla;

    @Column(name="bacen")
    private Integer bacen;

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getNamePt() {
        return namePt;
    }


    public String getSigla() {
        return sigla;
    }



    public Integer getBacen() {
        return bacen;
    }


}
