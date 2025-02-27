package hr.fer.progi.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import hr.fer.progi.backend.model.Settlement;


@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Long> {
	
	 @Query("SELECT s FROM Settlement s WHERE s.county.id = :countyId")
	 List<Settlement> findByCountyId(Long countyId);

	/* @Query("SELECT s FROM Settlement s WHERE s.settlementName = :settlementName LIMIT 1")
	Settlement findBySettlementName(String settlementName);*/

	Settlement findFirstBySettlementName(String settlementName);


	@Query(value = "SELECT * FROM settlement WHERE LOWER(REPLACE(TRIM(settlement_name), ' ', '')) = LOWER(REPLACE(TRIM(:settlementName), ' ', ''))", nativeQuery = true)
	Settlement findBySettlementNameIgnoringCaseAndSpaces(@Param("settlementName") String settlementName);

}
