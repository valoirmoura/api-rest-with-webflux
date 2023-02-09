//package com.apirest.webflux;

//@Component
//public class DummyData implements CommandLineRunner {
//
//    @Autowired
//    private PlaylistRepository playlistRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        playlistRepository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8", "Github", "Spring Security", "Web Service RESTFULL", "Bean Spring Framework")
//                                .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                                .flatMap(playlistRepository::save))
//                .subscribe(System.out::println);
//    }
//}
