package com.giovanebmr.citiesapi.cities;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="cidade")
@Entity(name="City")
@TypeDefs(
        @TypeDef(name="point", typeClass = PointType.class)
)
public class City {

    @Id
    private Long id;

    @Column(name="nome")
    private String name;

    @Column(name="uf")
    private String uf;

    @Column(name="ibge")
    private Integer ibge;

    @Column(name="lat_lon")
    private String geolocation;

    @Type(type = "point")
    @Column(name="lat_lon", updatable = false, insertable = false)
    private Point Location;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public Point getLocation() {
        return Location;
    }
}
