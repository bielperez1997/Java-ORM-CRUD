package br.com.fiap.smartcities.crud;

import br.com.fiap.smartcities.crud.*;
import br.com.fiap.smartcities.domain.DespesaEstabelecimento;
import br.com.fiap.smartcities.domain.Estabelecimento;
import br.com.fiap.smartcities.domain.LucroEstabelecimento;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Remover {
	
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
		
		Estabelecimento est1 = em.find(Estabelecimento.class, 1);
		Estabelecimento est2 = em.find(Estabelecimento.class, 2);
		
		DespesaEstabelecimento despesa = em.find(DespesaEstabelecimento.class, 1);
		DespesaEstabelecimento despesa2 = em.find(DespesaEstabelecimento.class, 2);
		
		LucroEstabelecimento lucro = em.find(LucroEstabelecimento.class, 1);
		LucroEstabelecimento lucro2 = em.find(LucroEstabelecimento.class, 2);
		
		try {
			em.remove(est1);
			em.remove(est2);
			em.remove(lucro);
			em.remove(lucro2);
			em.remove(despesa);
			em.remove(despesa2);
			
			em.getTransaction().begin();
			em.getTransaction().commit();}catch (Exception e) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
			}
			
			
			
			em.close();
	}
	
}
