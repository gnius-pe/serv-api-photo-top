package gnius.code.servapipublictop.service;

import gnius.code.servapipublictop.document.FotoInformation;
import gnius.code.servapipublictop.repository.FotoInformationReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotoTopService {
    @Autowired
    private FotoInformationReposotory fotoInformationReposotory;

    public List<FotoInformation> getTopFotoClasification (){
        return fotoInformationReposotory.findAll();
    }
}
