package com.border.border.repository;

import com.border.border.model.BorderCheckPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorderCheckPointRepository extends JpaRepository<BorderCheckPoint,Long> {

    BorderCheckPoint findByName(String name);
}
