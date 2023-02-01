package med.voll.domain.paciente;

import med.voll.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String cpf, String telefone, Endereco endereco) {
    
    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getCpf(),paciente.getTelefone(),paciente.getEndereco());
    }
}
