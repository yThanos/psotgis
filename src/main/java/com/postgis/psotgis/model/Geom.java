package com.postgis.psotgis.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Polygon;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GEOM")
public class Geom {
    @Id
    @Column(name = "ID_GEOM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "POLYG", columnDefinition = "geometry(Polygon,3857)")
    private Polygon polyg;
}
