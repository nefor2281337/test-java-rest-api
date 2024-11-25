package exampl.service.impl;

import exampl.DTO.DogDTO;
import exampl.entity.Dog;
import exampl.mapper.DogMapper;
import exampl.repository.DogRepository;
import exampl.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class DogServiceImpl implements DogService {

    private final DogRepository dogRepository;
    private final DogMapper dogMapper;

    @Override
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    @Override
    public ResponseEntity<Dog> getDogByName(String name) {
        var dog = dogRepository.findByName(name);
        if (dog == null) {
            return ResponseEntity.status(HttpStatusCode.valueOf(404)).build();
        }

        return new ResponseEntity<>(dog, HttpStatusCode.valueOf(200));
    }

    @Override
    public String addDog(DogDTO dogDTO) {
        try {
            dogRepository.save(dogMapper.toDog(dogDTO).setId(UUID.randomUUID()));
            return "Successfully added Dog";
        } catch (Exception e) {
            return String.format("Something went wrong: %s", e.getMessage());
        }
    }
}
