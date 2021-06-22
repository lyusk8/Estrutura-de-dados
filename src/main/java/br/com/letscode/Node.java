package br.com.letscode;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Node {

    private Pessoa dados;
    private Node next;

    public Node(Pessoa pessoa){
        this.dados = pessoa;
    }

}
