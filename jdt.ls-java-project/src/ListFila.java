public class ListFila<T> implements Fila<T> {

    private ListaEncadeada<T> elements;

    public ListFila(){
        elements = new ListaEncadeada<>();
    }

    @Override
    public void enqueue(T element){
        elements.adicionarFim(element);
    }

    @Override
    public T dequeue(){
        T element = elements.primeiro();
        elements.removerInicio();
        return element;
    }

    @Override
    public T first(){
        return elements.primeiro();
    }

    @Override
    public int size(){
        return elements.tamanho();
    }

    @Override
    public boolean isEmpty(){
        return elements.vazia();
    }

}