package br.com.letscode;

public interface EstruturaDeDados {

    public void adicionar(Pessoa pessoa);
    public void buscar(String nome);
    public void remover(Pessoa pessoa);
    public void remover(int index);
    public void listarTodos();
    public Pessoa getPessoa(int index);

}
