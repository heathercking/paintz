package com.codeclan.example.paintzServer.components;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.enums.PaintType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PaintRepository paintRepository;


    public DataLoader() {}

    public void run(ApplicationArguments args) {

        Paint hEmeraldGreen = new Paint(ManufacturerType.HUMBROL, "02", "AA0028", "Enamel Gloss Emerald Green", PaintType.ENAMEL, ColourType.GREEN, "#005B40", "14ML", 2.19);
        paintRepository.save(hEmeraldGreen);

        Paint hTrainerYellow = new Paint(ManufacturerType.HUMBROL, "24", "AA0268", "Enamel Matt Trainer Yellow", PaintType.ENAMEL, ColourType.YELLOW, "#FECC14", "14ML", 2.19);
        paintRepository.save(hEmeraldGreen);

    }
}
