package com.igorcastelo.javabasico.herancamultiplainterfaces;

public interface SqlDDL {
	
	void create(String query);
	void alter(String query);
	void drop (String query);
	
}
