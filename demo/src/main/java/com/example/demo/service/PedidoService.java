package com.example.demo.service;

import com.example.demo.model.Pedido;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();

    // Método para crear un pedido
    public Mono<Pedido> crearPedido(Pedido pedido) {
        pedidos.add(pedido);
        return Mono.just(pedido);
    }

    // Método para obtener todos los pedidos
    public Mono<List<Pedido>> obtenerPedidos() {
        return Mono.just(pedidos);
    }
}

