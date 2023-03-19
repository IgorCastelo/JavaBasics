package com.igorcastelo.javabasico.bancodedados;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Main {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha ="Aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		
		
			try {
				Class.forName(driverBanco);
				Connection conexao = DriverManager.getConnection(url,usuario,senha);
				
				System.out.println("Banco conectado");
			} catch (ClassNotFoundException ex) {
				System.out.println("Driver não localizado");
			
			}catch (SQLException ex) {
				System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
			}

}
	
}