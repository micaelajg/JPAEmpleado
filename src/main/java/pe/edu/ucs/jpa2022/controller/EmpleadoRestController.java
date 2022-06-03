/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ucs.jpa2022.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.ucs.jpa2022.entity.Empleado;
import pe.edu.ucs.jpa2022.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService postService;

    @GetMapping("/all")
    public List<Empleado> getPosts() {
        return postService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getPost(@PathVariable int id) {
        Empleado empleado = postService.read(id);
        return ResponseEntity.ok(empleado);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable int id) {        
        postService.delete(id);
    }
    @PostMapping("/add")
    public Empleado addPost(@RequestBody Empleado empleado) {  
        return postService.create(empleado);
    }
    @PutMapping("/edit")
    public Empleado editPost(@RequestBody Empleado empleado) {  
        Empleado pos = new Empleado(empleado.getId(),empleado.getNombre(),empleado.getApellido(),empleado.getDni());
        System.out.println(empleado.getId()+" , "+empleado.getNombre()+" , "+empleado.getApellido()+" , "+empleado.getDni());
        return postService.update(empleado);
    }
}
