package br.ufpb.dcx.rodrigor.atividade.sca.persistencia;

public class ErroPersistenciaException extends RuntimeException {
    public ErroPersistenciaException(String s) {
        super(s);
    }
}
