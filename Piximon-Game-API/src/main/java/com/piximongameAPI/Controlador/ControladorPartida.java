package com.piximongameAPI.Controlador;

import com.piximongameAPI.Servicios.ServicioJugador;
import com.piximongameAPI.Servicios.ServicioPartida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partida")
public class ControladorPartida {

    @Autowired
    private ServicioPartida servicioPartida;

    @GetMapping("/obtenerPartidaActual")
    int obtenerPartidaActual(String nombre) {
        return servicioPartida.obtenerPartidaActual(nombre);
    }
}
