package it.prova.hellotelevisore.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.hellotelevisore.dao.DB_Mock;
import it.prova.hellotelevisore.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	private Connection connection;

	@Override
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Televisore> findByMarcaAndModello(String marca, String modello) {

		List<Televisore> listaTelevisoriDaRicerca = new ArrayList<Televisore>();
		
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getMarca().startsWith(marca) && televisoreItem.getModello().startsWith(modello)) {
				listaTelevisoriDaRicerca.add(televisoreItem);
			}
		}
		
		return listaTelevisoriDaRicerca;
	}

	@Override
	public List<Televisore> list() throws Exception {
		
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		
		Televisore televisoreDaRitornare = null;
		
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getIdTelevisore() == id) {
				televisoreDaRitornare = televisoreItem;
			}
		}
		return televisoreDaRitornare;
	}

	@Override
	public int update(Televisore televisoreInput) throws Exception {
		
		return 0;
	}

	@Override
	public int insert(Televisore televisoreInput) throws Exception {
		
		televisoreInput.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(televisoreInput) ? 1 : 0;
	}

	@Override
	public int delete(Televisore televisoreInput) throws Exception {
		
		return DB_Mock.LISTA_TELEVISORI.remove(televisoreInput) ? 1 : 0;
	}

}