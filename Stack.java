
/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Exemplo de uma Classe Stack com bug - veja método pop()
*
*/

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
  private ArrayList<T> elements = new ArrayList<T>();
  private int size = 0;

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public void push(T elem) {
    elements.add(elem);
    size++;
  }

  public T pop() throws EmptyStackException {
    if (isEmpty())
      throw new EmptyStackException();
    // T elem = elements.get(size - 1 // BUG, pois não retira da pilha!
    T elem = elements.remove(size - 1); // código certo!
    size--;
    return elem;
  }
}