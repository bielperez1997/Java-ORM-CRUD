package br.com.fiap.smartcities.crud;




import br.com.fiap.smartcities.domain.DespesaEstabelecimento;
import br.com.fiap.smartcities.domain.Estabelecimento;
import br.com.fiap.smartcities.domain.LucroEstabelecimento;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Cadastro {

	public static void main(String[] args) {
EntityManager em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
		
		Estabelecimento est1 = new Estabelecimento(0,"Bar do Frango",null);
		Estabelecimento est2 = new Estabelecimento(0,"Bar do Juarez",null);
		
		DespesaEstabelecimento despesa = new DespesaEstabelecimento(0, "2000",null);
		DespesaEstabelecimento despesa2 = new DespesaEstabelecimento (0, "5000",null);
		
		LucroEstabelecimento lucro = new LucroEstabelecimento(0, "10000", null);
		LucroEstabelecimento lucro2 = new LucroEstabelecimento(0, "1000",null);
		
		try {
		em.merge(est1);
		em.merge(est2);
		em.merge(lucro);
		em.merge(lucro2);
		em.merge(despesa);
		em.merge(despesa2);
		
		em.getTransaction().begin();
		em.getTransaction().commit();}catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
		
		
		em.close();
		

	}

}
