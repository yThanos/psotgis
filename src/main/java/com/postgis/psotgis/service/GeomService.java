package com.postgis.psotgis.service;

import com.postgis.psotgis.model.Geom;
import com.postgis.psotgis.repository.GeomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeomService {
    private final GeomRepository geomRepository;

    public GeomService(GeomRepository geomRepository) {
        this.geomRepository = geomRepository;
    }

    public List<Geom> getAll() {
        return geomRepository.findAll();
    }

    public Geom save(Geom geom) {
        return geomRepository.save(geom);
    }

    public void delete(Integer id) {
        geomRepository.deleteById(id);
    }

    public Geom getById(Integer id){
        return geomRepository.findById(id).orElse(null);
    }
}
