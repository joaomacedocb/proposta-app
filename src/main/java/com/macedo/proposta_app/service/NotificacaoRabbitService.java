package com.macedo.proposta_app.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.macedo.proposta_app.domain.Proposta;

@Service
public class NotificacaoRabbitService {

    private RabbitTemplate rabbitTemplate;

    public NotificacaoRabbitService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void notificar(Proposta proposta, String exchange) {
        rabbitTemplate.convertAndSend(exchange, null, proposta);
    }

}
