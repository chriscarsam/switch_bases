package org.sam.switchbd.entity.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Data
public class User {
    @Id
    @Column(name = "userid")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "paternal_surname")
    private String sPaternal;
    @Column(name = "maternal_surname")
    private String sMaternal;

}
