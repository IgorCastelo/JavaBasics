package com.igorcastelo.javabasico.bancodedados;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class Main {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha ="Aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		final String  instrucao_insert ="INSERT INTO ALUNO (id,nome) VALUES(?,?)";
		
			try {
				Class.forName(driverBanco);
				Connection conexao = DriverManager.getConnection(url,usuario,senha);
				
				
				System.out.println("Banco conectado");
				
				PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_insert);
				
				preparedStatement.setInt(1,3);
				preparedStatement.setString(2,"igor Castelo");
				
				preparedStatement.executeUpdate();
				System.out.println("Inclusao realizada com sucesso");
				
				
			} catch (ClassNotFoundException ex) {
				System.out.println("Driver não localizado");
			}catch (SQLException ex) {
				System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
			}

}
	
}