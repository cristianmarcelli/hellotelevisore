package it.prova.hellotelevisore.model;

public class Televisore {

	Long idTelevisore;
	String marca;
	String modello;
	int prezzo;
	int numeroPollici;
	String codice;

	public Televisore() {
	}

	public Televisore(String marca, String modello) {
		super();
		this.marca = marca;
		this.modello = modello;
	}

	public Televisore(Long idTelevisore, String marca, String modello, int prezzo, int numeroPollici, String codice) {
		super();
		this.idTelevisore = idTelevisore;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroPollici = numeroPollici;
		this.codice = codice;
	}

	public Long getIdTelevisore() {
		return idTelevisore;
	}

	public void setIdTelevisore(Long idTelevisore) {
		this.idTelevisore = idTelevisore;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getNumeroPollici() {
		return numeroPollici;
	}

	public void setNumeroPollici(int numeroPollici) {
		this.numeroPollici = numeroPollici;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	@Override
	public String toString() {
		return "Televisore [idTelevisore=" + idTelevisore + ", marca=" + marca + ", modello=" + modello + ", prezzo="
				+ prezzo + ", numeroPollici=" + numeroPollici + ", codice=" + codice + "]";
	}

}