package api.Clientes.service;


import api.Clientes.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<Cliente> lista = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> listar(){
        return lista;
    }

    public Cliente buscarID(Long id){
        return lista.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }



    public Cliente criar(Cliente p) {
        p.setId(nextId);
        nextId++;
        this.lista.add(p);
        return p;
    }


    public boolean remover(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cliente atualizar(Long id, Cliente novo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                novo.setId(id);
                lista.set(i, novo);
                return novo;
            }
        }
        return null;
    }


}
