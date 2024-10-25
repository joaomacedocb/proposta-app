package com.macedo.proposta_app.mapper;

import com.macedo.proposta_app.domain.Proposta;
import com.macedo.proposta_app.domain.Usuario;
import com.macedo.proposta_app.dto.PropostaRequestDto;
import com.macedo.proposta_app.dto.PropostaResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-24T21:40:28-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
public class PropostaMapperImpl implements PropostaMapper {

    @Override
    public Proposta convertDtoToProposta(PropostaRequestDto propostaRequestDto) {
        if ( propostaRequestDto == null ) {
            return null;
        }

        Proposta proposta = new Proposta();

        proposta.setUsuario( propostaRequestDtoToUsuario( propostaRequestDto ) );
        proposta.setPrazoPagamento( propostaRequestDto.getPrazoPagamento() );
        proposta.setValorSolicitado( propostaRequestDto.getValorSolicitado() );

        proposta.setIntegrada( true );

        return proposta;
    }

    @Override
    public PropostaResponseDto convertPropostaToDto(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }

        PropostaResponseDto propostaResponseDto = new PropostaResponseDto();

        propostaResponseDto.setNome( propostaUsuarioNome( proposta ) );
        propostaResponseDto.setSobrenome( propostaUsuarioSobrenome( proposta ) );
        propostaResponseDto.setCpf( propostaUsuarioCpf( proposta ) );
        propostaResponseDto.setRenda( propostaUsuarioRenda( proposta ) );
        propostaResponseDto.setTelefone( propostaUsuarioTelefone( proposta ) );
        propostaResponseDto.setAprovado( proposta.getAprovado() );
        propostaResponseDto.setId( proposta.getId() );
        propostaResponseDto.setObservacao( proposta.getObservacao() );
        propostaResponseDto.setPrazoPagamento( proposta.getPrazoPagamento() );

        propostaResponseDto.setValorSolicitadoFmt( setValorSolicitadoFmt(proposta) );

        return propostaResponseDto;
    }

    @Override
    public List<PropostaResponseDto> convertListDomainToListDto(Iterable<Proposta> propostas) {
        if ( propostas == null ) {
            return null;
        }

        List<PropostaResponseDto> list = new ArrayList<PropostaResponseDto>();
        for ( Proposta proposta : propostas ) {
            list.add( convertPropostaToDto( proposta ) );
        }

        return list;
    }

    protected Usuario propostaRequestDtoToUsuario(PropostaRequestDto propostaRequestDto) {
        if ( propostaRequestDto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNome( propostaRequestDto.getNome() );
        usuario.setSobrenome( propostaRequestDto.getSobrenome() );
        usuario.setCpf( propostaRequestDto.getCpf() );
        usuario.setTelefone( propostaRequestDto.getTelefone() );
        usuario.setRenda( propostaRequestDto.getRenda() );

        return usuario;
    }

    private String propostaUsuarioNome(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String nome = usuario.getNome();
        if ( nome == null ) {
            return null;
        }
        return nome;
    }

    private String propostaUsuarioSobrenome(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String sobrenome = usuario.getSobrenome();
        if ( sobrenome == null ) {
            return null;
        }
        return sobrenome;
    }

    private String propostaUsuarioCpf(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String cpf = usuario.getCpf();
        if ( cpf == null ) {
            return null;
        }
        return cpf;
    }

    private Double propostaUsuarioRenda(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        Double renda = usuario.getRenda();
        if ( renda == null ) {
            return null;
        }
        return renda;
    }

    private String propostaUsuarioTelefone(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String telefone = usuario.getTelefone();
        if ( telefone == null ) {
            return null;
        }
        return telefone;
    }
}
