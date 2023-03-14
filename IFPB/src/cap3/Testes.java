package cap3;

public class Testes {

	public static void main(String[] args) {
		
		/* RETANGULO
		Retangulo r = new Retangulo(5);
		System.out.println(r.calcularDiagonal());
		*/
		
		/* TRIANGULO
		Triangulo t = new Triangulo(5, 10);
		System.out.println(t.calcularArea());
		System.out.println(t);
		*/
		
		/* ALUNO 
		Aluno a1 = new Aluno("joao", 100, 70);
		System.out.println(a1.getNome() + a1.getMedia() + a1.getSituacao());
		*/
		
		
		/* ALUNOFLEX
		AlunoFlex a1 = new AlunoFlex("renato", 100, 98, 99, 100, 89);
		System.out.println(a1);
		System.out.println(a1.getNota(2));
		System.out.println(a1.getMedia());
		System.out.println(a1.getSituacao());
		AlunoFlex a2 = new AlunoFlex("lucas", 100, 100, 79, 98, 84);
		System.out.println(a2);
		System.out.println(a2.getMedia());
		System.out.println(a2.getSituacao());
		*/
		
		/* CONTA */
		Conta c1 = new Conta("020301","12345678");
		System.out.println(c1);
		c1.creditar(5000);
		c1.debitar(145);
		System.out.println(c1);
		Conta c2 = c1.clonar();
		c2.setNumero("020302");
		System.out.println(c2);
		c2.transferir(500, c1);
		System.out.println(c2);
		System.out.println(c1);		
		
		/* PRODUTO E VENDA
		Produto p1 = new Produto("arroz", 10, 4.5);
		
		System.out.println("\nestoque antes da venda");
		System.out.println(p1);
		
		Venda v1 = new Venda("31/08/2022", p1, 2);
		System.out.println(v1);
		
		System.out.println("\nestoque depois da venda");
		System.out.println(p1); // tem que ser 8
		 */
	}

}
