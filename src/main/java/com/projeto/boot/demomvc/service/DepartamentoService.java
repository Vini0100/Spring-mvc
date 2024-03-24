package com.projeto.boot.demomvc.service;
import com.projeto.boot.demomvc.domain.Departamento;

import java.util.List;

public interface DepartamentoService {
    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();

    boolean depertamentoTemCargos(Long id);
}
