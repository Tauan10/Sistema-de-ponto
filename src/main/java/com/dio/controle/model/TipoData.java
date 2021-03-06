package com.dio.controle.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Builder
@Entity
public class TipoData {
    @Id
    private Long id;
    private String descricao;
}
