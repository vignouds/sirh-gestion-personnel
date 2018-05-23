package dev.sgp.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;

public class FrequentationFilter implements Filter {
	private FilterConfig config = null;
	int counter = 0;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config =config;
		config.getServletContext().log("FrequentationFilter initialized");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long before = System.currentTimeMillis();
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		counter++;
		VisiteWeb visite = new VisiteWeb();
		Integer temps = (int) (after-before);
		visite.setTempsExecution(temps);
		String chemin = ((HttpServletRequest) request).getRequestURI();
		visite.setChemin(chemin);
		visite.setId(counter);
	}

	@Override
	public void destroy() {
	}

}
