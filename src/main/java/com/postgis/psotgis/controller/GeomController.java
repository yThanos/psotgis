package com.postgis.psotgis.controller;

import com.postgis.psotgis.model.Geom;
import com.postgis.psotgis.service.GeomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/geom")
public class GeomController {
    private final GeomService geomService;

    public GeomController(GeomService geomService) {
        this.geomService = geomService;
    }

    @GetMapping("/all")
    public List<Geom> getAll() {
        return geomService.getAll();
    }

    @GetMapping("/save")
    public Geom save(Geom geom) {
        return geomService.save(geom);
    }

    @GetMapping("/delete")
    public void delete(Integer id) {
        geomService.delete(id);
    }

    @GetMapping("/getById")
    public Geom getById(Integer id){
        return geomService.getById(id);
    }
}
