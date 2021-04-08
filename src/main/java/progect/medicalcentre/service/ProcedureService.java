package progect.medicalcentre.service;

import progect.medicalcentre.model.Procedure;

import java.util.List;

public interface ProcedureService {

    List<Procedure> allProcedures();
    void add(Procedure procedure);
    void delete(Procedure procedure);
    void edit(Procedure procedure);
    Procedure getById(int id);
}
