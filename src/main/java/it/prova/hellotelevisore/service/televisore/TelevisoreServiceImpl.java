package it.prova.hellotelevisore.service.televisore;

import java.util.List;

import it.prova.hellotelevisore.dao.televisore.TelevisoreDAO;
import it.prova.hellotelevisore.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {

		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisore caricaSingoloTelevisore(Long id) throws Exception {

		return televisoreDAO.get(id);
	}

	@Override
	public int inserisciNuovoTelevisore(Televisore televisoreInput) throws Exception {

		return televisoreDAO.insert(televisoreInput);
	}

	@Override
	public int rimuoviTelevisore(Televisore televisoreInput) throws Exception {

		return televisoreDAO.delete(televisoreInput);
	}

	@Override
	public List<Televisore> elencaTutti() throws Exception {

		return televisoreDAO.list();
	}

}