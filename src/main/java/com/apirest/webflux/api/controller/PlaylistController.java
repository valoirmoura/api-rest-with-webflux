package com.apirest.webflux.api.controller;

import com.apirest.webflux.domain.document.Playlist;
import com.apirest.webflux.domain.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService service;

    @GetMapping()
    public Flux<Playlist> getPlaylist() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Playlist> save(@RequestBody Playlist playlist) {
        return service.save(playlist);
    }


    @GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, Playlist>> getPlaylistByEvents() {
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(5));
        Flux<Playlist> events = service.findAll();
        System.out.println("Passou aqui events");
        return Flux.zip(interval, events);
    }


}
