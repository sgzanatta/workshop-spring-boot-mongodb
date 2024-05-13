package com.nelioalves.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.services.UserService;

@RestController  //TODA CLASSE DE RECURSO VC USA O RESTCONTROLER
@RequestMapping(value="/users")  //PARA COLOCAR O CAMINHO DO ENDPOINT
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){    //LISTA DE USUARIOS USANDO FINDALL PARA BUSCAR TODOS
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
