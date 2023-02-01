package med.voll.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
    
    @NotBlank(message = "{nome.obrigatorio}")
    String nome,
    
    @NotBlank(message = "{email.obrigatorio}")
    @Email(message = "{email.invalido}")
    String email,
    
    @NotBlank(message = "{telefone.obrigatorio}")
    String telefone,
    
    @NotBlank(message = "Cpf nao pode ser vazio")
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")
    String cpf,
    
    @NotNull(message = "{endereco.obrigatorio}")
    @Valid DadosEndereco endereco) {}
        
