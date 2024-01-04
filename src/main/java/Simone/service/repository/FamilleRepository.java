package Simone.service.repository;

import Simone.service.model.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleRepository extends JpaRepository<Famille, Integer> {
}
