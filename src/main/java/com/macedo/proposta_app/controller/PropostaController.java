package com.macedo.proposta_app.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macedo.proposta_app.dto.PropostaRequestDto;

import com.macedo.proposta_app.dto.PropostaResponseDto;
import com.macedo.proposta_app.service.PropostaService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/proposta")
public class PropostaController {

    @Autowired
    private PropostaService propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponseDto> criar(@RequestBody PropostaRequestDto requestDto) {
        PropostaResponseDto response = propostaService.criar(requestDto);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(response.getId())
        .toUri())
        .body(response);
    }

    @GetMapping
    public ResponseEntity<List<PropostaResponseDto>> obterPropostas() {
        
        return ResponseEntity.ok(propostaService.obterProposta());
    }
    

}
