package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("Executando a logica...");
		System.out.println("Retornando a pagina JSP");
		return "primeira-logica.jsp";
	}

}
