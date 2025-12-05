package org.example.tp3pipeline.library.repositories;

import org.example.tp3pipeline.library.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // Exemple de méthode personnalisée (Spring Data JPA génère le code automatiquement)
    List<Member> findByName(String name);
}