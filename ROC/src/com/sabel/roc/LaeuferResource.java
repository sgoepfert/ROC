package com.sabel.roc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sachsenkamm/")
public class LaeuferResource {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public LaeuferResource() {
		emf = Persistence.createEntityManagerFactory("Laeufer");
		em = emf.createEntityManager();
	}
	
	public void startTransaction() {
		em.getTransaction().begin();
	}
	
	public void stopTransaction() {
		em.getTransaction().commit();
	}
	
	public void close() {
		if (em != null) {
			em.close();
		}
		em = null;
		if (emf != null) {
			emf.close();
		}
		emf = null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/laeufer")
	public List<Laeufer> getAllLaeufer() {
		TypedQuery<Laeufer> query = em.createQuery("SELECT l FROM Laeufer l WHERE l.startNummer >= 17", Laeufer.class);
		List<Laeufer> result = query.getResultList();
		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/laeufer/{startnummer}")
	public Laeufer getLaeufer(@PathParam("startnummer")int startnummer) {
		return em.find(Laeufer.class, startnummer);
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/test")
	public String test() {
		return "Hallo Steve";
	}
	

	public void addLaeufer(Laeufer laeufer) {
		startTransaction();
		em.persist(laeufer);
		stopTransaction();
	}
}
