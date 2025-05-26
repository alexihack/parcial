/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author SISTEMA
 */

    
import modelo.Docentes;
import java.util.ArrayList;
import java.util.List;

public class DocenteDAO implements IDocenteDAO {
    private List<Docentes> listaDocentes = new ArrayList<>();

    @Override
    public void agregar(Docentes docente) {
        listaDocentes.add(docente);
    }

    @Override
    public void modificar(int index, Docentes docente) {
        if (index >= 0 && index < listaDocentes.size()) {
            listaDocentes.set(index, docente);
        }
    }

    @Override
    public void eliminar(int index) {
        if (index >= 0 && index < listaDocentes.size()) {
            listaDocentes.remove(index);
        }
    }

    @Override
    public List<Docentes> obtenerTodos() {
        return listaDocentes;
    }

    public Docentes obtenerMasAlto() {
        return listaDocentes.stream().max((d1, d2) -> Double.compare(d1.getTalla(), d2.getTalla())).orElse(null);
    }

    public Docentes obtenerMasBajo() {
        return listaDocentes.stream().min((d1, d2) -> Double.compare(d1.getTalla(), d2.getTalla())).orElse(null);
    }

    public double promedioEdades() {
        return listaDocentes.stream().mapToDouble(d -> java.time.Period.between(d.getFechaNacimiento(), java.time.LocalDate.now()).getYears()).average().orElse(0);
    }
}

    

