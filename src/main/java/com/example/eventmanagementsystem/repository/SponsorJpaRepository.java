/*
 * You can use the following import statements
 *
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanagementsystem.model.Sponsor;
//import java.util.List;

@Repository
public interface SponsorJpaRepository extends JpaRepository<Sponsor, Integer> {
    // List<Sponsor> findByEvent(Event event);
}
