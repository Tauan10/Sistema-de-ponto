package com.dio.controle.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime data;
}
