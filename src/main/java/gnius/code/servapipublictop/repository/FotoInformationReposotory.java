package gnius.code.servapipublictop.repository;

import gnius.code.servapipublictop.document.FotoInformation;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface FotoInformationReposotory extends MongoRepository<FotoInformation,Long> {

}
