package exampl.mapper;


import exampl.DTO.CatDTO;
import exampl.entity.Cat;
import org.springframework.stereotype.Component;

@Component
public class CatMapper {

    public Cat toCat(CatDTO catDTO) {
        return new Cat().setAge(catDTO.getAge()).setName(catDTO.getName()).setWeight(catDTO.getWeight());
    }

}
