package br.senac.rj.victor.receptor.microservice.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.rj.victor.receptor.microservice.entity.McDonalds;
import br.senac.rj.victor.receptor.microservice.repository.McDonaldsRepository;

@Service
public class McDonaldsService {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	private final McDonaldsRepository mcDonaldsRepository;
	
	public McDonaldsService(McDonaldsRepository mcDonaldsRepository) {
		this.mcDonaldsRepository = mcDonaldsRepository;
	}
	
	@RabbitListener(queues = "fila-av2")
	public void suscribe(){
		List<McDonalds> pedidos = mcDonaldsRepository.findPedidosAtivos();
		for (McDonalds pedido : pedidos) { System.out.println(pedido.getPedidoId());};
	}
}
