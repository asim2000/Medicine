package com.company.dao;

import com.company.entity.Illness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public interface IllnessRepository extends JpaRepository<Illness,Long> {
    @Query("select s.illness from Symptom s where lower(s.name) like '%'||lower(?1)||'%'")
    Set<Illness> getIllnessesBySymptom(String symptom);
}
