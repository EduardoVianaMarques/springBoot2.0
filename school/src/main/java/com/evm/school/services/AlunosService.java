package com.evm.school.services;


import com.evm.school.models.AlunoModel;
import com.evm.school.repositores.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunosService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoModel criarAluno(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> buscarTodosAlunos(){
        return alunoRepository.findAll();

    }

    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);

    }


}