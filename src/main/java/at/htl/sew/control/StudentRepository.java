package at.htl.sew.control;

import at.htl.sew.entity.Student;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class StudentRepository implements PanacheRepository<Student> {

    public Student save(Student student){
        return getEntityManager().merge(student);
    }
}
