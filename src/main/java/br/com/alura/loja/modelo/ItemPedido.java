package br.com.alura.loja.modelo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "itens_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "preco_unitario")
    private BigDecimal precoUnicatio;

    private int quantidade;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;

    public ItemPedido(){

    }

    public ItemPedido(int quantidade, Pedido pedido, Produto produto) {
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.precoUnicatio = produto.getPreco();
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrecoUnicatio() {
        return precoUnicatio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrecoUnicatio(BigDecimal precoUnicatio) {
        this.precoUnicatio = precoUnicatio;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
