package com.apirest.webflux.domain.services;

import com.apirest.webflux.domain.document.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {

    Flux<Playlist> findAll(); //Tipo Mono e Tipo Flux são os tipos do webflux

    Mono<Playlist> findById(String id);

    Mono<Playlist> save(Playlist playlist);
}
