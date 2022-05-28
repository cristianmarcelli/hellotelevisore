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

@WebServlet("/PrepareDeleteTelevisoreServlet")
public class PrepareDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idTelevisoreDaEliminare = Integer.parseInt(request.getParameter("idDaInviareComeParametro"));
		
		Televisore televisoreDaEliminare = null;

		try {
			televisoreDaEliminare = MyServiceFactory.getTelevisoreServiceInstance()
					.caricaSingoloTelevisore((long) idTelevisoreDaEliminare);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		request.setAttribute("identificativoTelevisoreDaEliminare_attribute", televisoreDaEliminare);

		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);

	}

}