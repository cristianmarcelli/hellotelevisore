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
import it.prova.hellotelevisore.service.televisore.TelevisoreService;

@WebServlet("/PrepareUpdateTelevisoreServlet")
public class PrepareUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idTelevisoreDaModificare = request.getParameter("idDaInviareComeParametro");

		TelevisoreService televisoreService = MyServiceFactory.getTelevisoreServiceInstance();

		Televisore televisoreDaModificare = null;

		try {
			televisoreDaModificare = televisoreService
					.caricaSingoloTelevisore(Long.parseLong(idTelevisoreDaModificare));
		} catch (Exception e) {

			e.printStackTrace();
		}

		request.setAttribute("televisoreDaInviareAPaginaEdit", televisoreDaModificare);

		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);

	}

}