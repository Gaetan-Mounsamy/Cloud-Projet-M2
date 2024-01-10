package Simone.service.controller;

import Simone.service.model.Utilisateur;
import Simone.service.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/add")
    public String add(@RequestBody Utilisateur utilisateur) {
        utilisateurService.saveUtilisateur(utilisateur);
        return "New utilisateur is added";
    }

    @GetMapping("/getAll")
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateurs();
    }
}
