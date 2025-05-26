
    package DAO;

import modelo.Docentes;
import java.util.List;

public interface IDocenteDAO {
    void agregar(Docentes docente);
    void modificar(int index, Docentes docente);
    void eliminar(int index);
    List<Docentes> obtenerTodos();
}

    

