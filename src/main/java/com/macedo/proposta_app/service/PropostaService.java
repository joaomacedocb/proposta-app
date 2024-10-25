package com.macedo.proposta_app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.macedo.proposta_app.domain.Proposta;
import com.macedo.proposta_app.dto.PropostaRequestDto;
import com.macedo.proposta_app.dto.PropostaResponseDto;
import com.macedo.proposta_app.mapper.PropostaMapper;
import com.macedo.proposta_app.repository.PropostaRepository;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    @Autowired
    private NotificacaoRabbitService notificacaoService;

    @Autowired
    @Value("${rabbitmq.propostapendente.exchange}")
    private String exchange;

    public PropostaResponseDto criar(PropostaRequestDto requestDto) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(requestDto);

        propostaRepository.save(proposta);

        notificarRabbitMq(proposta);

        return PropostaMapper.INSTANCE.convertPropostaToDto(proposta);
    }

    private void notificarRabbitMq(Proposta proposta){
        try {
            notificacaoService.notificar(proposta, exchange);
        } catch (RuntimeException ex) {
            proposta.setIntegrada(false);
            propostaRepository.save(proposta);
        }
    }

    public List<PropostaResponseDto> obterProposta() {
        return PropostaMapper.INSTANCE.convertListDomainToListDto(propostaRepository.findAll());
    }

}
