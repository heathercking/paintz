package com.codeclan.example.paintzServer;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.enums.PaintType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.models.paint.PaintInventory;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaintTest {

    @Autowired
    PaintRepository paintRepository;


    @Test
    public void canSavePaintToDB() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "XXYAY", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "005B40", "14ML");
        paintRepository.save(paint1);
    }

    @Test
    public void canFindPaintsByHexValue() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "XXYAY", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "005B40", "14ML");
        paintRepository.save(paint1);

        List<Paint> found = paintRepository.findPaintsByHexValue("#005B40");
        assertEquals(2, found.size());

    }

    @Test
    public void canFindPaintByNumber() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "XXYAY", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "005B40", "14ML");
        paintRepository.save(paint1);

        List<Paint> found = paintRepository.findPaintsByPaintNum("XXYAY");
        assertEquals(1, found.size());
    }

    @Test
    public void canFindPaintByManufacturer() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "XXYAY", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "005B40", "14ML");
        paintRepository.save(paint1);

        List<Paint> found = paintRepository.findPaintsByManufacturer(ManufacturerType.HUMBROL);
        assertEquals(3, found.size());
    }

    @Test
    public void canFindPaintByNumberAndManufacturer() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "211", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "005B40", "14ML");
        paintRepository.save(paint1);

        Paint found = paintRepository.findPaintByPaintNumAndManufacturer("211", ManufacturerType.HUMBROL);
        String resultNum = found.getPaintNum();
        String resultHex = found.getHexValue();
        assertEquals("211", resultNum);
        assertEquals("005B40", resultHex);
    }

    @Test
    public void canFindMultiplePaintsByHexValue() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "211", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "005B40", "14ML");
        paintRepository.save(paint1);

        Paint lookup = paintRepository.findPaintByPaintNumAndManufacturer("211", ManufacturerType.HUMBROL);
        List<Paint> found = paintRepository.findPaintsByHexValue(lookup.getHexValue());
        assertEquals(4, found.size());

    }

    @Test
    public void canFindPaintsWithSameHexValues() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "211", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "A79656", "14ML");
        paintRepository.save(paint1);

        List<Paint> allPaints = paintRepository.findAll();
        List<Paint> found = paint1.findMatchesByHex(allPaints);
        assertEquals(6, found.size());
    }

    @Test
    public void canFindPaintsWithSimilarHexValues() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "211", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "A79656", "14ML");
        paintRepository.save(paint1);

        List<Paint> allPaints = paintRepository.findAll();
        List<Paint> found = paint1.findClosestMatches(allPaints);
        assertEquals(6, found.size());
    }

    @Test
    public void canAddPaintToUserInventory() {
        Paint paint1 = new Paint(ManufacturerType.HUMBROL, "211", "AA0028", "Test Paint", PaintType.ENAMEL, ColourType.GREEN, "A79656", "14ML");
        PaintInventory inventory = new PaintInventory();
        inventory.addPaintToInventory(paint1);
        assertEquals(1, inventory.getUserInventory().size());
    }

}
