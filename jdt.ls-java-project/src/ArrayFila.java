public class ArrayFila<T> implements Fila<T> {

    private T[] elements;
    private int t;

    public ArrayFila(){
        this(8);
    }

    public ArrayFila(int capacity){
        elements = (T[]) new Object[capacity];
        t = -1;
    }

    @Override
    public void enqueue(T element){
        if(size() == elements.length)
            throw new RuntimeException("muito cheia");

        elements[++t] = element;
    }

    @Override
    public T dequeue(){
        if(isEmpty())
            throw new RuntimeException("null");

        T element = elements[0];
        for(int i = 0; i < elements.length; i++){
            elements[i] = elements[++i];
        }
        t--;
        return element;
    }

    @Override
    public T first(){
        return elements[0];
    }

    @Override
    public int size(){
        return t + 1;
    }

    @Override
    public boolean isEmpty(){
        return t == -1;
    }

}