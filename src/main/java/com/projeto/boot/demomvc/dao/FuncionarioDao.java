package com.projeto.boot.demomvc.dao;
import com.projeto.boot.demomvc.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {
    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
