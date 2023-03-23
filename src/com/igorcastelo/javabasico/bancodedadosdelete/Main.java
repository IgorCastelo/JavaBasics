package com.igorcastelo.javabasico.bancodedadosdelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) {
		final String usuario = "postgres";
		final String senha = "Aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoDelete = "DELETE FROM aluno  WHERE id=? ";
		final String driverBanco ="org.postgresql.Driver";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexao realizada com sucesso");
			PreparedStatement  prepareStatement = conexao.prepareStatement(instrucaoDelete);
			
			prepareStatement.setInt(1,3);
			prepareStatement.executeUpdate();
			System.out.println("DELETE realizado com sucesso");

		}catch(ClassNotFoundException ex) {
			System.out.println("Driver não localizado");
		}catch(SQLException ex) {
			System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
			
		
		}

	}
}
