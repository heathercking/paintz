package com.codeclan.example.paintzServer;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.enums.PaintType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintTest {

    Paint paint1;

    @BeforeEach
    public void beforeEach() {
        paint1 = new Paint(ManufacturerType.HUMBROL, "02", "AA0028", "Enamel Gloss Emerald Green", PaintType.ENAMEL, ColourType.GREEN, "#005B40", "14ML", 2.19);
    }

    @Test
    public void hasName() {
        assertEquals("Enamel Gloss Emerald Green", paint1.getName());
    }

}
