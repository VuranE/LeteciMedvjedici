package hr.fer.progi.backend.repository;

import hr.fer.progi.backend.model.Action;
import hr.fer.progi.backend.model.AppUser;
import hr.fer.progi.backend.model.Need;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeedsRepository extends JpaRepository<Need, Long> {

    List<Need> findAll();

    Need findNeedById(Long id);
}