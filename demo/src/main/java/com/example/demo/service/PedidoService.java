package com.example.demo.service;

import com.example.demo.model.Pedido;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class PedidoService {

    private List<Pedido> pedidos = List.of(
            new Pedido("1", "Laptop", 2, 2400.0),
            new Pedido("2", "Mouse", 5, 125.0),
            new Pedido("3", "Teclado", 3, 135.0)
    );

    public Flux<Pedido> obtenerPedidos() {
        return Flux.fromIterable(pedidos);
    }

    public Mono<Pedido> crearPedido(Pedido pedido) {
        pedidos.add(pedido);
        return Mono.just(pedido);
    }
}

