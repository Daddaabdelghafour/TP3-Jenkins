package org.example.tp3pipeline.library.repositories;

import org.example.tp3pipeline.library.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    // Trouver tous les prêts dont la date de retour est dépassée
    List<Loan> findByReturnDateBefore(LocalDate date);
}