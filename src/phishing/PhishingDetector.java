package phishing;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Model;


/**
 * Servlet implementation class PhishingDetector
 */
@WebServlet(description = "Cette classe sert à recevoir et à répondre aux requêtes de vérification de phishing.", urlPatterns = { "/home" })
public class PhishingDetector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhishingDetector() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestedUrl = request.getRequestURI();
		if (requestedUrl.endsWith("/home"))
		{	
			getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
					.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestedUrl = request.getRequestURI();
		if (requestedUrl.endsWith("/home"))
		{
			String url = request.getParameter("url");
	
			if(url != null && url.trim() != "")
			{
				request.setAttribute("url", url);
				request.setAttribute("result", Model.request(url));
				
			}else
			{
				request.setAttribute("urlError", "Veuillez renseigner l'Url du site à vérifier!");
			}
			
			getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
			.forward(request, response);
		}
		
	}

}
