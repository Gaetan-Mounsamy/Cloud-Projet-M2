package Simone.service.controller;

import Simone.service.model.Vehicule;
import Simone.service.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

    @Autowired
    private VehiculeService vehiculeService;

    @PostMapping("/add")
    public String add(@RequestBody Vehicule vehicule) {
        vehiculeService.saveVehicule(vehicule);
        return "New vehicule is added";
    }

    @GetMapping("/getAll")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }
}
