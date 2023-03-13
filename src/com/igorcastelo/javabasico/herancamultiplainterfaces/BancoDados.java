package com.igorcastelo.javabasico.herancamultiplainterfaces;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{
public void abrirConexao();
public void fecharConexao();

@Override
public void grant() {

	
}
@Override
public void revoke() {

	
}

}
