package me.xueyao.repository;

import me.xueyao.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Simon.Xue
 * @date 1/21/21 5:09 PM
 **/
public interface PersonRepository extends CrudRepository<Person, Long> {
}
