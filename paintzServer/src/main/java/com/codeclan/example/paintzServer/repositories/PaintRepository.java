package com.codeclan.example.paintzServer.repositories;

import com.codeclan.example.paintzServer.models.paint.Paint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaintRepository extends JpaRepository<Paint, Long> {



}
