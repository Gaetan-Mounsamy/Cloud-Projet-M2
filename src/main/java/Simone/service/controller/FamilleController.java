package Simone.service.controller;

import Simone.service.model.Famille;
import Simone.service.service.FamilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/famille")
@CrossOrigin
public class FamilleController {

    @Autowired
    private FamilleService familleService;

    @PostMapping("/add")
    public String add(@RequestBody Famille famille) {
        familleService.saveFamille(famille);
        return "New famille is added";
    }

    @GetMapping("/getAll")
    public List<Famille> getAllFamilles() {
        return familleService.getAllFamilles();
    }
}
