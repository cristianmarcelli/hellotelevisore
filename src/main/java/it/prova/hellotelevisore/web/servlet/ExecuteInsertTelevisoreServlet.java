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

@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Televisore televisoreInstance = new Televisore();

		String marca = request.getParameter("marcaInput");
		String modello = request.getParameter("modelloInput");
		Integer prezzo = Integer.parseInt(request.getParameter("prezzoInput"));
		Integer numeroPollici = Integer.parseInt(request.getParameter("numeroPolliciInput"));
		String codice = request.getParameter("codiceInput");

		televisoreInstance.setMarca(marca);
		televisoreInstance.setModello(modello);
		televisoreInstance.setPrezzo(prezzo);
		televisoreInstance.setNumeroPollici(numeroPollici);
		televisoreInstance.setCodice(codice);

		try {
			MyServiceFactory.getTelevisoreServiceInstance().inserisciNuovoTelevisore(televisoreInstance);
		} catch (Exception e) {

			e.printStackTrace();
		}

		try {
			request.setAttribute("listaTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().elencaTutti());
		} catch (Exception e) {

			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);

	}

}