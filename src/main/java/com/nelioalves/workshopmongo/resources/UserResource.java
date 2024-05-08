package com.nelioalves.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.domain.User;

@RestController  //TODA CLASSE DE RECURSO VC USA O RESTCONTROLER
@RequestMapping(value="/users")  //PARA COLOCAR O CAMINHO DO ENDPOINT
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){    //LISTA DE USUARIOS USANDO FINDALL PARA BUSCAR TODOS
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Green", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex)); //ADICIONANDO MARIA E ALEX NA LISTA
		return ResponseEntity.ok().body(list);
	}
}
