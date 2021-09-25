package ir.dataplatform.springbootjpasampleh2.repository;

import ir.dataplatform.springbootjpasampleh2.model.Phonebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhonebookRepository extends JpaRepository<Phonebook,Long> {
}
