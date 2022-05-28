package it.prova.hellotelevisore.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisore.dao.DB_Mock;
import it.prova.hellotelevisore.model.Televisore;
import it.prova.hellotelevisore.service.MyServiceFactory;

@WebServlet("/ExecuteDeleteTelevisoreServlet")
public class ExecuteDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idTelevisoreDaEliminare = request.getParameter("idTelevisore");

		try {

			Televisore televisoreDaEliminare = MyServiceFactory.getTelevisoreServiceInstance().caricaSingoloTelevisore(Long.parseLong(idTelevisoreDaEliminare));

			request.setAttribute("listaTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().elencaTutti());

			MyServiceFactory.getTelevisoreServiceInstance().rimuoviTelevisore(televisoreDaEliminare);
		} catch (Exception e) {

			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");

		rd.forward(request, response);

	}

}