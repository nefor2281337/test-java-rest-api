package exampl.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@Entity
@Table(name="cats")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int age;

    private double weight;

}
