package com.codeclan.example.paintzServer;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.PaintType;
import com.codeclan.example.paintzServer.models.paint.Humbrol;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumbrolTest {

    Humbrol humbrol;

    @BeforeEach
    public void beforeEach() {
        humbrol = new Humbrol("2", "AA0028", "Humbrol Gloss Emerald Green", PaintType.ENAMEL, ColourType.GREEN, "#005B40", "14ML", 2.19);
    }

    @Test
    public void paintHasName() {
        assertEquals("Humbrol Gloss Emerald Green", humbrol.getName());
    }

}
