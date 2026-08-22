package br.edu.ifpe.oxefood_api_douglas.api.empresa;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) { this.empresaService = empresaService; }

    @PostMapping
    public ResponseEntity<Empresa> cadastrar(@RequestBody EmpresaDTO dto) {
        Empresa empresaCadastrado = empresaService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaCadastrado);
    }
}
