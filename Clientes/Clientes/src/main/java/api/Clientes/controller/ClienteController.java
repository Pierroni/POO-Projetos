package api.Clientes.controller;


import api.Clientes.model.Cliente;
import api.Clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {

        Cliente cliente = service.buscarID(id);

        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente p) {
        Cliente criado = service.criar(p);
        URI uri = URI.create("/clientes/" + criado.getId());
        return ResponseEntity.created(uri).body(criado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        return service.remover(id) ?
                ResponseEntity.noContent().build() :
                ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente ret = service.atualizar(id, cliente);
        if (ret == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ret);
        }
    }
}
