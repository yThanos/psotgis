package com.postgis.psotgis.repository;

import com.postgis.psotgis.model.Geom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeomRepository extends JpaRepository<Geom, Integer> {
}
