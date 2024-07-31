package uz.bunyodbek.datarestjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.bunyodbek.datarestjava.model.Person;

@RepositoryRestResource(path = "person")
public interface PersonRepository extends JpaRepository<Person,Integer> {


}
