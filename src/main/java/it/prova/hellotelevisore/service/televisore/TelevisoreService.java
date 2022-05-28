package it.prova.hellotelevisore.service.televisore;

import java.util.List;

import it.prova.hellotelevisore.dao.televisore.TelevisoreDAO;
import it.prova.hellotelevisore.model.Televisore;

public interface TelevisoreService {

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);

	public Televisore caricaSingoloTelevisore(Long id) throws Exception;

	public int inserisciNuovoTelevisore(Televisore televisoreInput) throws Exception;

	public int rimuoviTelevisore(Televisore televisoreInput) throws Exception;
	
	public int modificaTelevisore(Televisore televisoreInput) throws Exception;

	public List<Televisore> elencaTutti() throws Exception;

}