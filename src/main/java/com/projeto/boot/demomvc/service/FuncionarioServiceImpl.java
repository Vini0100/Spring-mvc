package com.projeto.boot.demomvc.service;
import com.projeto.boot.demomvc.dao.FuncionarioDao;
import com.projeto.boot.demomvc.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service @Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao dao;

    @Override
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
    }

    @Override
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Funcionario> buscarTodos() {
        return dao.findAll();
    }

    @Override
    public Object buscarPorNome(String nome) {
        return null;
    }

    @Override
    public Object buscarPorCargo(Long id) {
        return null;
    }

    @Override
    public Object buscarPorDatas(LocalDate entrada, LocalDate saida) {
        return null;
    }
}
