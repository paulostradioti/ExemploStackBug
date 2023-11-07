/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Teste que reproduz o bug da classe Stack
*
*/

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {
	
  Stack<Integer> stack;

	@Test
	public void testPushPopStack() {
    /*
     * 1) Criar uma pilha vazia
     * 2) Empilhar 10
     * 3) Empilhar 20
     * 4) Desempilhar um valor
     * 5) Empilhar 30
     * 6) Desempilhar um valor, que deveria ser 30
     */
    stack = new Stack<Integer>();
    stack.push(10);
    stack.push(20);
    Integer a = stack.pop();
    stack.push(30);
    Integer obtido = stack.pop();
    
    Integer esperado = 30;
    assertEquals(esperado, obtido);
	}

}