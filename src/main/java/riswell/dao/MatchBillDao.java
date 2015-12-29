package riswell.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import riswell.model.MatchBill;

public interface MatchBillDao extends JpaRepository<MatchBill, Integer>,JpaSpecificationExecutor<MatchBill>
{

}
