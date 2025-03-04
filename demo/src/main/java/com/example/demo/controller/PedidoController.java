package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;


    @PostMapping
    public Mono<Pedido> crearPedido(@RequestBody Pedido pedido) {
        return pedidoService.crearPedido(pedido);
    }


    @GetMapping
    public Mono<List<Pedido>> obtenerPedidos() {
        return pedidoService.obtenerPedidos();
    }
}
