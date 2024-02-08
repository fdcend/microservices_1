package com.fdcend.libros.repository;

import com.fdcend.libros.dto.autorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "autorAPI", url = "http://localhost:9002")
public interface IautorDTOrepository {

@GetMapping("/autor/{id}")
public autorDTO getAutorInfo(@PathVariable("id") int id);


}
