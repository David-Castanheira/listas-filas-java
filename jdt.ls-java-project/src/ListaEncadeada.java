public class ListaEncadeada<T> implements ListaEncadeadaInterface<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho;

    public ListaEncadeada(){
        cabeca = null;
        cauda = null;
        tamanho = 0;
    }

    @Override
    public void adicionarInicio(T elemento){
        No<T> no = new No<T>(elemento, cabeca);
        cabeca = no;
        if(vazia())
            cauda = cabeca;
        tamanho++;
    }

    @Override
    public void adicionarFim(T elemento){
        No<T> no = new No<T>(elemento, null);
        if(vazia())
            cabeca = no;
        else
            cauda.setProximo(no);
        cauda = no;
        tamanho++;
    }

    @Override
    public void removerInicio() {
        if (vazia())
            throw new RuntimeException("null");

        cabeca = cabeca.getProximo();
        tamanho--;
        if (vazia())
            cauda = null;
    }

    @Override
    public void removerFim(){
        if(vazia())
            throw new RuntimeException("null");

        No<T> ant = cabeca;
        for(int i = 0; i < tamanho - 1; i++){
            ant = ant.getProximo();
        }
        ant.setProximo(null);
        cauda = ant;
        tamanho--;
        if(vazia()){
            cabeca = null;
            cauda = null;
        }
    }

    @Override
    public T primeiro(){
        if(vazia())
            throw new RuntimeException("null");

        return cabeca.getElemento();
    }

    @Override
    public T ultimo(){
        if(vazia())
            throw new RuntimeException("null");

        return cauda.getElemento();
    }

    @Override
    public int tamanho(){
        return tamanho;
    }

    @Override
    public boolean vazia(){
        return tamanho == 0;
    }

    @Override
    public void adicionar(int posicao, T elemento){
        if(posicao < 0 || posicao > tamanho)
            throw new IllegalArgumentException("Posição Requerida Inválida");

        No<T> no = new No(elemento, null);
        if(vazia() || posicao == 0){
            adicionarInicio(elemento);
        }
        else if(posicao == tamanho()){
            adicionarFim(elemento);
        }
        else{
            No<T> add = cabeca;
            for(int i = 0; i < posicao -1; i++){
                add = add.getProximo();
            }
            no.setProximo(add.getProximo());
            add.setProximo(no);
            this.tamanho++;
        }
    }

    @Override
    public T buscar(int posicao){
        if(vazia())
            throw new RuntimeException("null");

        if(posicao < 0 || posicao >= tamanho)
            throw new RuntimeException("Posição Requerida Inválida");

        No<T> bus = cabeca;
        for(int i = 0; i < posicao; i++){
            bus = bus.getProximo();
        }
        return bus.getElemento();
    }

}