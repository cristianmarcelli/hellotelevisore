package it.prova.hellotelevisore.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.hellotelevisore.service.MyServiceFactory;

@WebServlet("/ExecuteSearchTelevisoreServlet")
public class ExecuteSearchTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String marcaInput = request.getParameter("marcaInput");
		String modelloInput = request.getParameter("modelloInput");

		request.setAttribute("listaTelevisoriAttributeName",
				MyServiceFactory.getTelevisoreServiceInstance().cercaPerMarcaEModello(marcaInput, modelloInput));

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");

		rd.forward(request, response);

	}

}