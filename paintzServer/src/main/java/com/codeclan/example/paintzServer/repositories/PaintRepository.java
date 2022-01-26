package com.codeclan.example.paintzServer.repositories;

import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaintRepository extends JpaRepository<Paint, Long> {

    List<Paint> findPaintsByHexValue(String hexValue);

    List<Paint> findPaintsByPaintNum(String number);

    List<Paint> findPaintsByManufacturer(ManufacturerType manufacturer);

}
