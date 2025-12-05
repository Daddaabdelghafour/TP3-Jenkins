package org.example.tp3pipeline.library.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate loanDate;
    private LocalDate returnDate;

    // On pourrait ajouter des relations ici (ex: @ManyToOne vers Book ou Member),
    // mais pour ce TP simple, on reste basique.

    // Constructeur vide requis par JPA
    public Loan() {
    }

    public Loan(LocalDate loanDate, LocalDate returnDate) {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getLoanDate() { return loanDate; }
    public void setLoanDate(LocalDate loanDate) { this.loanDate = loanDate; }

    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }
}