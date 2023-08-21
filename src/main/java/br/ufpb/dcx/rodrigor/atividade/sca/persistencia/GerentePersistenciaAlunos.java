package br.ufpb.dcx.rodrigor.atividade.sca.persistencia;

import br.ufpb.dcx.rodrigor.atividade.sca.model.Aluno;

import java.util.List;

public interface GerentePersistenciaAlunos {

    public void cadastrarAluno(Aluno aluno) throws ErroPersistenciaException;

    public List<Aluno> recuperarAlunos() throws ErroPersistenciaException;

}
