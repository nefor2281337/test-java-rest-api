package exampl.mapper;


import exampl.DTO.DogDTO;
import exampl.entity.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogMapper {

    public Dog toDog(DogDTO dogDTO) {
        return new Dog().setAge(dogDTO.getAge()).setName(dogDTO.getName());
    }

}
