package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Empresa")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CNPJ_empresa")
    private String CNPJEmpresa;

    @Column(name = "Endereço_empresa")
    private String Endereço_empresa;

    @Column(name = "telefone")
    private String telefone;


}
