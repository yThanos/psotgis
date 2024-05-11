package com.postgis.psotgis.model;

import org.locationtech.jts.geom.Polygon;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GEOM")
public class Geom {
    @Id
    @Column(name = "ID_GEOM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "POLYG", columnDefinition = "geometry(Polygon,4326)")
    private Polygon polyg;
}
