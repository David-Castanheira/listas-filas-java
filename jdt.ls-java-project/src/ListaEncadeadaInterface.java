public interface ListaEncadeadaInterface<T> {
    void adicionarInicio(T elemento);
    void adicionarFim(T elemento);
    void removerInicio();
    void removerFim();
    T primeiro();
    T ultimo();
    int tamanho();
    boolean vazia();
    T buscar(int posicao);
    void adicionar(int posicao, T elemento);
}