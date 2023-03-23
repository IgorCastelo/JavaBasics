package com.igorcastelo.javabasico.readexception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		final String usuario = "postgres";
		final String senha = "Aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoSelect = "SELECT * FROM professor";
		final String driverBanco ="org.postgresql.Driver";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexao realizada com sucesso");
			PreparedStatement  prepareStatement = conexao.prepareStatement(instrucaoSelect);
			
			ResultSet rs = prepareStatement.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				System.out.println("Id = " + id + "   Nome: " + nome);
				
			}
			System.out.println("Query(consulta) realizado com sucesso");
			

		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(SQLException ex) {
			System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());	
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Fim de programa");
		}
	}
	}

