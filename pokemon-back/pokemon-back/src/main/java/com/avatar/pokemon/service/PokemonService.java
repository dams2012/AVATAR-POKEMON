package com.avatar.pokemon.service;

import java.util.List;

import com.avatar.pokemon.model.Pokemon;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;

public interface PokemonService {
	
	List<Pokemon> obtenerListaEspecies(PokeApi p, int limit);

}
