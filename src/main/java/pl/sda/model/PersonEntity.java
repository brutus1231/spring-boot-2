package pl.sda.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String pesel;
}
