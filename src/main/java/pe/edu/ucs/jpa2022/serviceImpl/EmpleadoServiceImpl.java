/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ucs.jpa2022.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.ucs.jpa2022.entity.Empleado;
import pe.edu.ucs.jpa2022.repository.EmpleadoRepository;
import pe.edu.ucs.jpa2022.service.EmpleadoService;

/**
 *
 * @author admin
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    @Override
    public Empleado create(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void delete(int id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    public Empleado read(int id) {
        return empleadoRepository.findById(id).get();
    }

    @Override
    public List<Empleado> readAll() {
        return empleadoRepository.findAll();
    }
    
}
