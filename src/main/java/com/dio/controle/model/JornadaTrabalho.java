package com.dio.controle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;


}
