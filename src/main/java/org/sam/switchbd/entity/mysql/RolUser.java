package org.sam.switchbd.entity.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="rol_user" )
@NoArgsConstructor
@Data
public class RolUser {

    @Id
    @Column(name = "id_rol")
    private Long id;

    @Column(name = "rol_description")
    private String rol;


}
