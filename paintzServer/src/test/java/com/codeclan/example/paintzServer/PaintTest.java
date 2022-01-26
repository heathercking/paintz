package com.codeclan.example.paintzServer;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.enums.PaintType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaintTest {

    @Autowired
    PaintRepository paintRepository;

    @Test
    public void canSavePaintToDB() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "XXYAY", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "#005B40", "14ML", 2.19);
        paintRepository.save(paint1);
    }



}
