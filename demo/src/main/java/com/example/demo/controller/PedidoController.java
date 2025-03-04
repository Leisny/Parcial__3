package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Locale;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private MessageSource messageSource;

    // Listar todos los pedidos
    @GetMapping
    public Flux<Pedido> listarPedidos(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
               return pedidoService.obtenerPedidos();
    }

    // Crear un nuevo pedido
    @PostMapping
    public Mono<Pedido> crearPedido(@RequestBody Pedido pedido, @RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return pedidoService.crearPedido(pedido);
    }
}
