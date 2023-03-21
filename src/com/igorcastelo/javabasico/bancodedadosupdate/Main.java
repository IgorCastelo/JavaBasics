package com.igorcastelo.javabasico.bancodedadosupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		final String usuario = "postgres";
		final String senha = "Aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoUpdate = "UPDATE aluno SET  nome = ? WHERE id=? ";
		final String driverBanco ="org.postgresql.Driver";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexao realizada com sucesso");
			PreparedStatement  prepareStatement = conexao.prepareStatement(instrucaoUpdate);
			
			prepareStatement.setInt(2,3);
			prepareStatement.setString(1, "UPDATE* Igor");
			
			prepareStatement.executeUpdate();
			prepareStatement.executeUpdate();
			System.out.println("UPDATE realizado com sucesso");

		}catch(ClassNotFoundException ex) {
			System.out.println("Driver não localizado");
		}catch(SQLException ex) {
			System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
			
		
		}

	}
}

