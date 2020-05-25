package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
}

