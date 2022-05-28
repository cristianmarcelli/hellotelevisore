package it.prova.hellotelevisore.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.hellotelevisore.model.Televisore;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		LISTA_TELEVISORI.add(new Televisore(1l, "Samsung", "M67", 250, 48, "SMSM67900"));
		LISTA_TELEVISORI.add(new Televisore(2l, "Samsung", "M50", 150, 40, "SMSM50900"));
		LISTA_TELEVISORI.add(new Televisore(3l, "LG", "L80", 350, 45, "LGL80500"));
		LISTA_TELEVISORI.add(new Televisore(4l, "LG", "L50", 135, 38, "LGL50500"));
		LISTA_TELEVISORI.add(new Televisore(5l, "LG", "L20", 130, 30, "LGL20500"));
		LISTA_TELEVISORI.add(new Televisore(6l, "Sony", "S800", 130, 40, "SNYS800K"));
		LISTA_TELEVISORI.add(new Televisore(7l, "Sony", "S500", 450, 50, "SNYS500K"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId = LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}

}