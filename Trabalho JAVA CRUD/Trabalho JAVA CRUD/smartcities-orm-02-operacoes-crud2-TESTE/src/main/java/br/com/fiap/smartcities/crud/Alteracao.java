package br.com.fiap.smartcities.crud;
import br.com.fiap.smartcities.domain.*;
import br.com.fiap.smartcities.crud.*;
import br.com.fiap.smartcities.domain.DespesaEstabelecimento;
import br.com.fiap.smartcities.domain.Estabelecimento;
import br.com.fiap.smartcities.domain.LucroEstabelecimento;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Alteracao {

	public static void main(String[] args) {
	EntityManager em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
	
	Estabelecimento est1 = em.find(Estabelecimento.class, 1);
	Estabelecimento est2 = em.find(Estabelecimento.class, 2);
	
	DespesaEstabelecimento despesa = em.find(DespesaEstabelecimento.class, 1);
	DespesaEstabelecimento despesa2 = em.find(DespesaEstabelecimento.class, 2);
	
	LucroEstabelecimento lucro = em.find(LucroEstabelecimento.class, 1);
	LucroEstabelecimento lucro2 = em.find(LucroEstabelecimento.class, 2);
	
	
	System.out.println(est1.getId() +" "+ est1.getNome());
	System.out.println(est2.getId() +" "+ est2.getNome());
	System.out.println(despesa.getId() +" "+ despesa.getNome());
	System.out.println(despesa2.getId() +" "+ despesa2.getNome());
	System.out.println(lucro.getId() +" "+ lucro.getNome());
	System.out.println(lucro2.getId() +" "+ lucro2.getNome());
	
	est2.setNome("Bar do Joares");
	
	em.getTransaction().begin();
	em.getTransaction().commit();
	
	System.out.println(est2.getId() +" "+ est2.getNome());
	
	em.close();
}

}
