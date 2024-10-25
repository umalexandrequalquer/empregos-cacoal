package com.cacoal.empregos.services;

import com.cacoal.empregos.entity.Empresa;
import com.cacoal.empregos.entity.Vegas;
import com.cacoal.empregos.interfaces.EmpresaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmpresaServices {



    @Autowired
    private EmpresaInterface empresaInterface;


    public List<Empresa> getAll() {
       return empresaInterface.findAll();
    }


    public void makeEmpresa(Empresa empresa) {
        empresaInterface.save(empresa);
    }

    public void addVagas(Vegas vegas, UUID uuid) {
        Optional<Empresa> empresa = empresaInterface.findById(uuid);
       if (empresa.isPresent()) {
           empresa.get().addVaga(vegas);
           empresaInterface.save(empresa.get());
       }else
           throw new RuntimeException("Empresa não encontrada");
    }

}
