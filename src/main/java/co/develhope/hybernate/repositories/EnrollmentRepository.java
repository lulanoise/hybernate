package co.develhope.hybernate.repositories;

import co.develhope.hybernate.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long> {

}
