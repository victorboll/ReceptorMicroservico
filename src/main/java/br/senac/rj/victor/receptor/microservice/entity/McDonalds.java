package br.senac.rj.victor.receptor.microservice.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class McDonalds {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
	@Column(name = "dt_criacao")
    private LocalDateTime dataCriacao;
    @Column(name = "status", nullable = false)
    private int status;
    @Column(name = "pedido_id", nullable = false)
    private long pedidoId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(long pedidoId) {
		this.pedidoId = pedidoId;
	}
}
