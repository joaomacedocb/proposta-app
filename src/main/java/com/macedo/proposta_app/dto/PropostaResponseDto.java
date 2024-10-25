package com.macedo.proposta_app.dto;

public class PropostaResponseDto {

    private Long id;

    private String nome;

    private String sobrenome;

    private String cpf;

    private String telefone;

    private Double renda;

    private String valorSolicitadoFmt;

    private int prazoPagamento;

    private Boolean aprovado;

    private String observacao;

    public PropostaResponseDto(Long id, String nome, String sobrenome, String cpf, String telefone, Double renda,
            String valorSolicitadoFmt, int prazoPagamento, Boolean aprovado, String observacao) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.renda = renda;
        this.valorSolicitadoFmt = valorSolicitadoFmt;
        this.prazoPagamento = prazoPagamento;
        this.aprovado = aprovado;
        this.observacao = observacao;
    }

    public PropostaResponseDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public String getValorSolicitadoFmt() {
        return valorSolicitadoFmt;
    }

    public void setValorSolicitadoFmt(String valorSolicitadoFmt) {
        this.valorSolicitadoFmt = valorSolicitadoFmt;
    }

    public int getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(int prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
