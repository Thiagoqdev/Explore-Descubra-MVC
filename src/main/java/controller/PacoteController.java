package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.PacotesDAO;
import modelos.Pacotes;


@WebServlet(urlPatterns = { "/pacotes", "/pacotes-create", "/pacotes-edit", "/pacotes-update", "/pacotes-delete" })
public class PacoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PacotesDAO pdao = new PacotesDAO();
	Pacotes pacotes = new Pacotes();


	public PacoteController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/pacotes":
			read(request, response);
			break;
		case "/pacotes-create":
			create(request, response);
			break;
		case "/pacotes-edit":
			edit(request, response);
			break;
		case "/pacotes-update":
			update(request, response);
			break;
		case "/pacotes-delete":
			delete(request, response);
			break;
		default:
			response.sendRedirect("index.html");
			break;
		}

	}

	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pacotes> lista = pdao.read();

		request.setAttribute("listaPacotes", lista);

		RequestDispatcher rd = request.getRequestDispatcher("./views/pacotes/index.jsp");
		rd.forward(request, response);

	}

	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		pacotes.setPeriodo_pacotes(request.getParameter("periodo_pacotes"));
		pacotes.setDestino_pacotes(request.getParameter("destino_pacotes"));
		pacotes.setPreco_pacotes(Float.parseFloat(request.getParameter("preco_pacotes")));


		pdao.create(pacotes);
		response.sendRedirect("pacotes");
	}

	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		pacotes = pdao.readById(id);
		
		request.setAttribute("pacotes", pacotes);

		RequestDispatcher rd = request.getRequestDispatcher("./views/pacotes/update.jsp");
		rd.forward(request, response);
	}

	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		pacotes.setId_pacotes(Integer.parseInt(request.getParameter("id")));
		pacotes.setDestino_pacotes(request.getParameter("destino_pacotes"));
		pacotes.setPeriodo_pacotes(request.getParameter("periodo_pacotes"));
		pacotes.setPreco_pacotes(Float.parseFloat(request.getParameter("preco_pacotes")));


		pdao.update(pacotes);
		response.sendRedirect("pacotes");
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id  = Integer.parseInt(request.getParameter("id"));
		pdao.delete(id);
		response.sendRedirect("pacotes");
	}

}
