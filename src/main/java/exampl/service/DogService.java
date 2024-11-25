package exampl.service;

import exampl.DTO.DogDTO;
import exampl.entity.Dog;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DogService {

    List<Dog> getAllDogs();

    ResponseEntity<Dog> getDogByName(String name);

    String addDog(DogDTO dogDTO);

}
