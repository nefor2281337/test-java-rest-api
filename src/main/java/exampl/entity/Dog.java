package exampl.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Document
@Accessors(chain = true)
public class Dog {

    @Id
    private UUID id;

    @Indexed(unique = true)
    private String name;

    private Integer age;

}
