package br.com.letscode;

public class LinkedList implements EstruturaDeDados{

    private Node head;

    @Override
    public void adicionar(Pessoa pessoa) {
        if(this.head == null){
            this.head = new Node(pessoa);
        } else {
            Node node = new Node(pessoa);
            node.setNext(this.head.getNext());
            this.head.setNext(node);
        }

    }

    @Override
    public void buscar(String nome) {
        Node node = this.head;
        while (node != null){
            if(node.getDados().getNome() == nome){
                System.out.println(node);
                return;
            }
            node = node.getNext();
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        Node node = this.head;
        while (node != null){
            if(node.getNext().getDados().equals(pessoa)){
                node.setNext(node.getNext().getNext());
            }
            node = node.getNext();
        }
    }

    @Override
    public void remover(int index) {
        if(index == 0){
            this.head = this.head.getNext();
            return;
        } else {
            Node node = this.head;
            int contador = 0;
            while (node != null){
                if(contador+1 == index){
                    node.setNext(node.getNext().getNext());
                }
                contador++;
                node = node.getNext();
            }
        }

    }

    @Override
    public void listarTodos() {
        Node node = this.head;
        while (node != null){
            System.out.println(node);
            node = node.getNext();
        }

    }

    @Override
    public Pessoa getPessoa(int index) {
        if(index == 0){
            return head.getDados();
        } else {
            Node node = this.head;
            int contador = 1;
            while (node != null){
                if(contador == index){
                    return node.getDados();
                }
                contador++;
                node = node.getNext();
            }
        }
        return null;
    }
}
