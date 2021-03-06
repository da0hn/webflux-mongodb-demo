package me.gabriel.webflux.core.ports;

import me.gabriel.webflux.application.api.dto.PlaylistDto;
import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author daohn
 * @since 01/08/2021
 */
public interface PlaylistService {

  Mono<Playlist> save(PlaylistDto playlist);
  Mono<Playlist> findById(String id);
  Mono<Identity> deleteById(String id);
  Flux<Playlist> findAll();

}
