package it.prova.hellotelevisore.dao.televisore;

import java.sql.Connection;
import java.util.List;

import it.prova.hellotelevisore.model.Televisore;

public interface TelevisoreDAO {

	public void setConnection(Connection connection);
	
	public List<Televisore> list() throws Exception;
	
	public Televisore get(Long id) throws Exception;
	
	public int update(Televisore televisoreInput) throws Exception;
	
	public int insert(Televisore televisoreInput) throws Exception;
	
	public int delete(Televisore televisoreInput) throws Exception;

	public List<Televisore> findByMarcaAndModello(String marca, String modello);

}