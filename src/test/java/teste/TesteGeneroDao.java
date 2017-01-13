package teste;

import java.util.List;

import br.com.willian.biblioteca.Dao.GeneroDao;
import br.com.willian.biblioteca.entity.Genero;

public class TesteGeneroDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testeCadastrar();
		//testeAlterar();
		//buscaTodosGeneros();
		testeSalvar();
		
	}

	private static void buscaTodosGeneros(){
		
		GeneroDao genDao= new GeneroDao();
		List<Genero> lista = genDao.buscaTodosGeneros();
		System.out.println(lista);
	}
	private static void testeCadastrar(){
		
		Genero gen = new Genero();
		gen.setDescricao("Comédia");
		
		GeneroDao genDao = new GeneroDao();
		genDao.cadastrarGenero(gen);
		
		System.out.println("cadastrado com sucesso!!!!!! ");
	}
	
	
	
	private static void testeAlterar(){
		Genero gen = new Genero();
		gen.setId(2);
		gen.setDescricao("Comédia");
		
		GeneroDao genDao = new GeneroDao();
		genDao.alterar(gen);
		System.out.println("Alterado com sucesso !!!!");
	}
	private static void testeSalvar(){
		Genero gen = new Genero();
		gen.setId(1);
		gen.setDescricao("Ficçao");
		
		GeneroDao genDao = new GeneroDao();
		genDao.salvarGenero(gen);
		
		System.out.println("Salvo com sucesso!!!!!!");
	}
}
