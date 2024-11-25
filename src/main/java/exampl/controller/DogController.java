package exampl.controller;


import exampl.DTO.DogDTO;
import exampl.entity.Dog;
import exampl.repository.DogRepository;
import exampl.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs")
@RequiredArgsConstructor
public class DogController {

    private final DogService dogService;

    @GetMapping("/all")
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @GetMapping()
    public ResponseEntity<Dog> getDogsByName(@RequestParam String name) {
        return dogService.getDogByName(name);
    }

    @PostMapping()
    public String addDog(@RequestBody DogDTO dogDTO) {
        return dogService.addDog(dogDTO);
    }
}
