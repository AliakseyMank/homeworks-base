package progect.medicalcentre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.medicalcentre.model.Procedure;
import progect.medicalcentre.repository.ProcedureDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProcedureServiceImpl implements ProcedureService{

    @Autowired
    ProcedureDao procedureDao;

    @Override
    @Transactional
    public List<Procedure> allProcedures() {
        return procedureDao.allProcedures();
    }

    @Override
    @Transactional
    public void add(Procedure procedure) {
        procedureDao.add(procedure);
    }

    @Override
    @Transactional
    public void delete(Procedure procedure) {
        procedureDao.delete(procedure);
    }

    @Override
    @Transactional
    public void edit(Procedure procedure) {
        procedureDao.edit(procedure);
    }

    @Override
    @Transactional
    public Procedure getById(int id) {
        return procedureDao.getById(id);
    }
}
