package com.piximongameAPI.Repositorios;


import com.piximongameAPI.Entidades.Jugador;
import com.piximongameAPI.Entidades.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioPartida extends JpaRepository<Partida, Integer> {

    //Por si queremos obtener la partida para algo
    @Query(value = "SELECT * FROM partida WHERE id = :id", nativeQuery = true)
    Partida findById(int id);

    //Obtener partida en la que juega nuestro usuario jugador actual
    @Query(value = "SELECT partida_id FROM jugadores WHERE nombre_jugador = :nombre", nativeQuery = true)
    int obtenerPartidaActual(String nombre);



}