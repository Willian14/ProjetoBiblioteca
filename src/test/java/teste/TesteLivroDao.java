package teste;

import java.util.List;

import br.com.willian.biblioteca.Dao.LivroDao;
import br.com.willian.biblioteca.entity.Livro;

public class TesteLivroDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testeCadastrar();
		// testeExcluir();
		//testeListar();
		testeSalvarLivro();
		//testeAlterar();
		//testeBuscaPorIsbn();
	}
	
	private static void testeBuscaPorIsbn() {
		LivroDao livDao = new LivroDao();
		Livro li = livDao.buscaPorIsbn(1235);
		
		System.out.println(li);
		
	}

	private static void testeCadastrar(){
		Livro liv = new Livro();
		liv.setIsbn(1236);
		liv.setTitulo("cinco minutos");
		liv.setDescricao("livros antigos");
		liv.setAnoLanc("21/09/2016");
		liv.setId_autor(1);
		liv.setId_genero(1);
		liv.setNome_autor("Maria Joana");
		liv.setDescricao_genero("Comédia");
		
		
		LivroDao livDao = new LivroDao();
		livDao.cadastrarLivro(liv);
		
		System.out.println("Cadastrado com sucesso!!!!!");
		
	}
	
	private static void testeExcluir(){
		Livro liv = new Livro();
		liv.setIsbn(1235);
		
		LivroDao livDao = new LivroDao();
		livDao.excluirLivro(liv);
		
		System.out.println("Excluido com sucesso!!!!!");
		
	}
	
private static void testeAlterar(){
	Livro liv = new Livro();
	liv.setIsbn(1236);
	liv.setTitulo("supernatural");
	liv.setDescricao("livros antigos");
	liv.setAnoLanc("12/05/1880");
	liv.setId_autor(1);
	liv.setId_genero(1);
	liv.setNome_autor("Maria Joana");
	liv.setDescricao_genero("Comédia");
	
	LivroDao livDao = new LivroDao();
	livDao.alterarLivro(liv);
	
	System.out.println("Alterado com sucesso!!!!!");
	}

private static void testeListar(){
	LivroDao livDao = new LivroDao();
	List<Livro> listaConsulta = livDao.buscarTodosLivros();
	for(Livro l: listaConsulta){
		System.out.println(l);
	}
}

private static void testeSalvarLivro(){
	Livro li = new Livro();
	li.setIsbn(1237);
	li.setTitulo("Biblia ");
	li.setDescricao("livros antigos");
	li.setAnoLanc("12/05/1880");
	li.setId_autor(3);
	li.setId_genero(1);
	li.setNome_autor("Willian");
	li.setDescricao_genero("Comédia");
	
	LivroDao liDao = new LivroDao();
	liDao.salvarLivro(li);
	
	System.out.println("Salvo com sucesso");
}

}
