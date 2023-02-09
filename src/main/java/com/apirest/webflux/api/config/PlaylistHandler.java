//package com.apirest.webflux.api.config;
//
//import com.apirest.webflux.domain.document.Playlist;
//import com.apirest.webflux.domain.services.PlaylistService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
//import static org.springframework.web.reactive.function.server.ServerResponse.ok;
//import static org.springframework.web.reactive.function.server.ServerResponse.status;
//import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
//
//@Component
//public class PlaylistHandler {
//
//    @Autowired
//    private PlaylistService service;
//
//    //Mesmo Retornando uma Lista, utilizamos o Mono neste caso!
//    public Mono<ServerResponse> findAll(ServerRequest request) {
//        return ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(service.findAll(), Playlist.class);
//    }
//
//    public Mono<ServerResponse> findById(ServerRequest request) {
//        return ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(service.findById(request.pathVariable("id")), Playlist.class);
//    }
//
//    public Mono<ServerResponse> save(ServerRequest request) {
//        final Mono<Playlist> playlist = request.bodyToMono(Playlist.class);
//
//        return status(HttpStatus.CREATED)
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(fromPublisher(playlist.flatMap(service::save), Playlist.class));
//    }
//
//}
