package hr.fer.progi.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hr.fer.progi.backend.model.Resource;
import hr.fer.progi.backend.model.Embeddable.ResourceId;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findAll();

    List<Resource> findByHumanitarianOrganizationId(Long id);

    Resource findById(ResourceId id);
}
