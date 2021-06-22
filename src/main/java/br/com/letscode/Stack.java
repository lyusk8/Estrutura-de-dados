package br.com.letscode;

public class Stack implements EstruturaDeDados{

    public Pessoa[] pessoas = new Pessoa[10];
    public int contador = 0;

    public Stack() {
        pessoas = new Pessoa[10];
    }


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
        for(Pessoa pessoa : pessoas){
            if(pessoa.getNome() == nome){
                System.out.println(pessoa);
                return;
            }
        }

    }

    @Override
    public void remover(Pessoa pessoa) {
        if(pessoa.equals(pessoas[contador-1])){
            pessoas[pessoas.length-1] = null;
            contador--;
        }else {
            System.out.println("Esta pessoa não é a ultima da pilha");
        }
    }

    @Override
    public void remover(int index) {
        if(index == contador - 1){
            pessoas[index] = null;
            contador--;
        }else{
            System.out.println("Este indice não corresponde a ultima pessoa da pilha");
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
        return this.pessoas[index];
    }

}
