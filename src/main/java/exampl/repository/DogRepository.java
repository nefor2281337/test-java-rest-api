package exampl.repository;

import exampl.entity.Dog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DogRepository extends MongoRepository<Dog, UUID> {

    Dog findByName(String name);

}
