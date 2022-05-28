package it.prova.hellotelevisore.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisore.model.Televisore;
import it.prova.hellotelevisore.service.MyServiceFactory;

@WebServlet("/ExecuteUpdateTelevisoreServlet")
public class ExecuteUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String marca = request.getParameter("marcaInput");
		String modello = request.getParameter("modelloInput");
		Integer prezzo = Integer.parseInt(request.getParameter("prezzoInput"));
		Integer numeroPollici = Integer.parseInt(request.getParameter("numeroPolliciInput"));
		String codice = request.getParameter("codiceInput");

		try {
			Televisore televisoreDaRecuperare = MyServiceFactory.getTelevisoreServiceInstance()
					.caricaSingoloTelevisore(Long.parseLong(request.getParameter("idTelevisore")));

			televisoreDaRecuperare.setMarca(marca);
			televisoreDaRecuperare.setModello(modello);
			televisoreDaRecuperare.setPrezzo(prezzo);
			televisoreDaRecuperare.setNumeroPollici(numeroPollici);
			televisoreDaRecuperare.setCodice(codice);

			request.setAttribute("listaTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().elencaTutti());

		} catch (Exception e) {

			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);

	}

}
