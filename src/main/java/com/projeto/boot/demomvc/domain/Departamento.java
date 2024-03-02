package com.projeto.boot.demomvc.domain;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.Name;
import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60) //unique nenhum outro nome poderá ser igual no banco de dados
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
}
