package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_LOCALIDAD")
    private Localidad localidad;
}
