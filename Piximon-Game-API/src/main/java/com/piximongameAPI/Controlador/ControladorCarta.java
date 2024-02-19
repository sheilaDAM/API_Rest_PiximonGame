package com.piximongameAPI.Controlador;

import com.piximongameAPI.Entidades.Carta;
import com.piximongameAPI.Repositorios.RepositorioCarta;
import com.piximongameAPI.Servicios.ServicioCarta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartas")
public class ControladorCarta {

    /*@Autowired
    private RepositorioCarta repositorioCarta;*/

    @Autowired
    private ServicioCarta servicioCarta;

    @GetMapping("/getCartas")
    public List<Carta> listarCartas() {
        List<Carta> cartas = servicioCarta.obtenerCartas();
        return cartas;
    }

    @GetMapping("/obtenerCartasJugador/{id}")
    public List<Carta> obtenerCartasJugador(@PathVariable int id) {
    List<Carta> cartas = servicioCarta.obtenerCartasJugador(id);
    return cartas;
    }
}
