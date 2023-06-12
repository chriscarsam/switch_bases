package org.sam.switchbd.entity.mysql;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="roles" )
@NoArgsConstructor
@Data
public class RolUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rol_description")
    private String rol;


}
