package progect.medicalcentre.repository;

import progect.medicalcentre.model.Procedure;

import java.util.List;

public interface ProcedureDao {
    List<Procedure> allProcedures();
    void add(Procedure procedure);
    void delete(Procedure procedure);
    void edit(Procedure procedure);
    Procedure getById(int id);
}
