package org.sam.switchbd.entity.postgres;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "paternal_surname")
    private String sPaternal;

    @Column(name = "maternal_surname")
    private String sMaternal;

}
