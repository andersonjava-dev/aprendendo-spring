package com.javanauta.aprendendo_spring.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cep", length = 12)
    private String cep;
    @Column(name = "cidade", length = 100)
    private String cidade;
    @Column(name = "complemento", length = 10)
    private String complemento;
    @Column(name = "estado", length = 2)
    private String estado;
    @Column(name = "numero", length = 255)
    private String numero;
    @Column(name = "rua", length = 100)
    private String rua;


}
