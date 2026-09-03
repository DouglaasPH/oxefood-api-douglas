package br.edu.ifpe.oxefood_api_douglas.api.produto;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) { this.repository = repository; }

    public Produto build(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setCodigo(dto.getCodigo());
        produto.setTitulo(dto.getTitulo());
        produto.setDescricao(dto.getDescricao());
        produto.setValorUnitario(dto.getValorUnitario());
        produto.setTempoEntregaMinimo(dto.getTempoEntregaMinimo());
        produto.setTempoEntregaMaximo(dto.getTempoEntregaMaximo());

        return produto;
    }

    @Transactional
    public Produto cadastrar(ProdutoDTO dto) {
        Produto produto = build(dto);
        return repository.save(produto);
    }

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id).get();
    }
}
