package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato("Jorge Luiz", "Branco com marrom", 1);
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}

}

class Livro{
	
	private String nome;
	private Integer npag;
	
}
