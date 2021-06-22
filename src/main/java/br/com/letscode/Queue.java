package br.com.letscode;

public class Queue implements EstruturaDeDados {

    private Pessoa[] pessoas = new Pessoa[10];
    int contador = 0;


    @Override
    public void adicionar(Pessoa pessoa) {
        if(this.pessoas.length - 1 == this.contador){
            Pessoa [] novo = new Pessoa[this.pessoas.length *2];
            for (int i = 0; i < this.pessoas.length; i++){
                novo[i] = this.pessoas[i];
            }
            this.pessoas = novo;
        }
        this.pessoas[this.contador] = pessoa;
        contador++;
    }

    @Override
    public void buscar(String nome) {
        for(var i=0; i<this.pessoas.length; i++){
            if(this.pessoas[i].getNome().equals(nome)){
                System.out.println(this.pessoas[i]);
                break;
            }
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        if(this.pessoas[0].equals(pessoa)){
            for(int i=0; i < this.contador; i++){
                    this.pessoas[i] = this.pessoas[i+1];
            }
            this.contador--;
        } else {
            System.out.println("Esta pessoa não é a primeira da fila.");
        }
    }

    @Override
    public void remover(int index) {
        if(index == 0){
            for(int i=0; i < this.contador; i++){
                    this.pessoas[i] = this.pessoas[i+1];
            }
            this.contador--;
        } else {
            System.out.println("Este índice não corresponde a primeira pessoa da fila.");
        }
    }

    @Override
    public void listarTodos() {
        System.out.println("Lista de pessoas: ");
        if(this.contador == 0){
            System.out.println("0 pessoas");
        }
        for (Pessoa pessoa : this.pessoas){
            if(pessoa != null){
                System.out.println(pessoa);
            }
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        return pessoas[index];
    }

}
