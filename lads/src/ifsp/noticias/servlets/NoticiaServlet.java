package ifsp.noticias.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ifsp.noticias.beans.Noticia;
import ifsp.noticias.beans.NoticiaEsporteDecorator;
import ifsp.noticias.beans.NoticiaSimples;
import ifsp.noticias.beans.NoticiaSuper;

/**
 * Servlet implementation class NoticiaEsporteServlet
 */
@WebServlet("/NoticiaServlet")
public class NoticiaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Noticia noticia = new NoticiaSimples();
		noticia.geraNoticia("FUTEBOL", "13/06/2018", "SAO PAULO: GOLAÇO DO NENE");
		Noticia noticiaEsporte = new NoticiaEsporteDecorator(noticia);
		
		Noticia noticia1 = new NoticiaSimples();
		noticia.geraNoticia("INDECISAO", "13/06/2018", "LULA PRESO");
		Noticia noticiaPolitica = new NoticiaEsporteDecorator(noticia1);

		req.setAttribute("noticia", noticiaEsporte);
		req.setAttribute("noticia1", noticiaPolitica);
		
		RequestDispatcher view = req.getRequestDispatcher("index.xhtml");
		view.forward(req, resp);

	}
}
