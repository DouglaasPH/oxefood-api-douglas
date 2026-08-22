package br.edu.ifpe.oxefood_api_douglas.api.empresa;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpresaService {
    private final EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository) { this.repository = repository; }

    public Empresa build(EmpresaDTO dto) {
        Empresa empresa = new Empresa();
        empresa.setSite(dto.getSite());
        empresa.setCnpj(dto.getCnpj());
        empresa.setInscricaoEstadual(dto.getInscricaoEstadual());
        empresa.setNomeEmpresarial(dto.getNomeEmpresarial());
        empresa.setNomeFantasia(dto.getNomeFantasia());
        empresa.setFone(dto.getFone());
        empresa.setFoneAlternativo(dto.getFoneAlternativo());

        return empresa;
    }

    @Transactional
    public Empresa cadastrar(EmpresaDTO dto) {
        Empresa empresa = build(dto);
        return repository.save(empresa);
    }
}
