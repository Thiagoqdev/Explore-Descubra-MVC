package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CompraDAO;
import modelos.Compras;

@WebServlet(urlPatterns = { "/compra", "/compra-create", "/compra-edit", "/compra-update", "/compra-delete" })
public class CompraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CompraDAO codao = new CompraDAO();
	Compras compra = new Compras();


	public CompraController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/compra":
			read(request, response);
			break;
		case "/compra-create":
			create(request, response);
			break;
//		case "/compra-edit":
//			edit(request, response);
//			break;
//		case "/compra-update":
//			update(request, response);
//			break;
		case "/compra-delete":
			delete(request, response);
			break;
		default:
			response.sendRedirect("index.html");
			break;
		}

	}

	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Compras> lista = codao.read();

		request.setAttribute("listaCompras", lista);

		RequestDispatcher rd = request.getRequestDispatcher("./views/compras/index.jsp");
		rd.forward(request, response);

	}

	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		compra.setData_compras(request.getParameter("data_compras"));
		compra.setDestino_pacotes(request.getParameter("destino_pacotes"));
		compra.setPeriodo_pacotes(request.getParameter("periodo_pacotes"));

		codao.create(compra);
		response.sendRedirect("compra");
	}

	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		compra = codao.readById(id);
		
		request.setAttribute("compra", compra);

		RequestDispatcher rd = request.getRequestDispatcher("./views/compras/update.jsp");
		rd.forward(request, response);
	}

	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		compra.setId_compras(Integer.parseInt(request.getParameter("id")));
		compra.setData_compras(request.getParameter("data_pacotes"));
		compra.setDestino_pacotes(request.getParameter("destino_pacotes"));
		compra.setPeriodo_pacotes(request.getParameter("periodo_pacotes"));


		codao.update(compra);
		response.sendRedirect("compra");
	}
//
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		codao.delete(id);
		response.sendRedirect("compra");
	}

}
