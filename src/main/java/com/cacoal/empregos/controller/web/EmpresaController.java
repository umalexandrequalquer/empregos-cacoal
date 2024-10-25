package com.cacoal.empregos.controller.web;


import com.cacoal.empregos.entity.Empresa;
import com.cacoal.empregos.services.EmpresaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cacoal.empregos.entity.Vegas;
import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("empresa")
public class EmpresaController {
    Vegas y = new Vegas("estoque","no caixa",2000.0);
    Empresa x = new Empresa("ddX", "cabralalexandre99d9@gmail.com", "wenbfkdjbdsef", "23423d4234", "69999d094138","pioneirod" ,y);
    @Autowired
    private EmpresaServices empresaServices;

    @GetMapping("/all")
    public List<Empresa> getAll() {
       return empresaServices.getAll();
    }

    @GetMapping("/text")
    public String getText() {
        return "HEllo";
}

    @PostMapping("/make")
    public void make( @RequestBody Empresa empresa) {
        empresaServices.makeEmpresa(empresa);
    }
    @GetMapping("/x")
    public void getX() {
        empresaServices.makeEmpresa(x);
    }

    @PostMapping("/add")
    public void AddVagas(@RequestBody Vegas vegas, @RequestParam UUID uuid) {
    empresaServices.addVagas(vegas, uuid);
    }
}
