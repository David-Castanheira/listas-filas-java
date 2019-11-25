public interface Fila<T> {

    void enqueue(T element);
    T dequeue();
    T first();
    int size();
    boolean isEmpty();

}