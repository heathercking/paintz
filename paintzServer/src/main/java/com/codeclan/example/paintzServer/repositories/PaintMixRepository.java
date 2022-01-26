package com.codeclan.example.paintzServer.repositories;

import com.codeclan.example.paintzServer.models.paint.PaintMix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaintMixRepository extends JpaRepository<PaintMix, Long> {



}
