package teste;

import java.util.ArrayList;
import java.util.List;

import br.com.willian.biblioteca.Dao.AutorDao;
import br.com.willian.biblioteca.entity.Autor;

public class TesteAutorDao {

	public static void main(String[] args) {
		//testeCadastrar();
		//testeBuscaTodos();
		testeSalvarAutor();
		//testeAlterar();
	}
	
	
	private static void testeSalvarAutor(){
		Autor aut = new Autor();
		aut.setId(10);
		aut.setNome("Maria Joana da Silva");
	
		
		AutorDao autDao = new AutorDao();
		autDao.salvarAutor(aut);
		System.out.println("Salvo com sucesso!!!!!");
	}
	
	private static void testeCadastrar(){
		Autor aut = new Autor();
		aut.setNome("Maria Joana");
				
		AutorDao autDao = new AutorDao();
		autDao.cadastrarAutor(aut);
		System.out.println("cadastrado com sucesso");
	}
	

	
	private static void testeBuscaTodos(){
		AutorDao autDao = new AutorDao();
		
		List<Autor> lista = autDao.buscaTodos();
		
		System.out.println(lista);
						
	}
	
	private static void testeAlterar(){
		Autor aut = new Autor();
		aut.setId(2);
		aut.setNome("Maria Joana Almeida");
		aut.setEmail("Mari@.com");
		
		AutorDao autDao = new AutorDao();
		autDao.alterarAutor(aut);
		System.out.println("Alterado com sucesso");
	}
	

}
