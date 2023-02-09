package com.apirest.webflux.domain.services;

import com.apirest.webflux.domain.document.Playlist;
import com.apirest.webflux.domain.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Override
    public Flux<Playlist> findAll() {
        return playlistRepository.findAll();
    }

    @Override
    public Mono<Playlist> findById(String id) {
        return playlistRepository.findById(id);
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return playlistRepository.save(playlist);
    }
}
