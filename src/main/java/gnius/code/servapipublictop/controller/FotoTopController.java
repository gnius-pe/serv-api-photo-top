package gnius.code.servapipublictop.controller;

import gnius.code.servapipublictop.document.FotoInformation;
import gnius.code.servapipublictop.service.FotoTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/foto")
public class FotoTopController {

    @Autowired
    private FotoTopService fotoTopService;

    @GetMapping("/clasificacion")
    public List<?> getTopFoto(){
        return fotoTopService.getTopFotoClasification();
    }
}
