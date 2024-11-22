package exampl.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import exampl.entity.Cat;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class CatObjectMapper extends ObjectMapper {

    public String CatWriteValueAsString(Iterable<Cat> cat) {
        try {
            return super.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            System.out.println("Error with object mapper: " + e.getMessage());
            return "Cat was not found";
        }
    }

    public String CatWriteValueAsString(Optional<Cat> cat) {
        if (cat.isEmpty()) return "Cat was not found";

        try {
            return super.writeValueAsString(cat.get());
        } catch (JsonProcessingException e) {
            System.out.println("Error with object mapper: " + e.getMessage());
            return "Cat was not found";
        }
    }

}
