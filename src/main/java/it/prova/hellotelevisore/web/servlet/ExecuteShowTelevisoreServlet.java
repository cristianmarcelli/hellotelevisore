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

/**
 * Servlet implementation class ExecuteShowTelevisoreServlet
 */
@WebServlet("/ExecuteShowTelevisoreServlet")
public class ExecuteShowTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametroTelevisoreDiCuiVoglioIlDettaglio = request.getParameter("idDaInviareComeParametro");

		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		Televisore televisoreInstance = null;
		
		try {
			televisoreInstance = televisoreServiceInstance.caricaSingoloTelevisore(Long.parseLong(parametroTelevisoreDiCuiVoglioIlDettaglio));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("televisoreDaInviareAPaginaDettaglio", televisoreInstance);
		
		RequestDispatcher rd = request.getRequestDispatcher("dettaglio.jsp");
		
		rd.forward(request, response);

	}

}