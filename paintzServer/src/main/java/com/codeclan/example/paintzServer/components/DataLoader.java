package com.codeclan.example.paintzServer.components;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.enums.PaintType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.models.people.UserAccount;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import com.codeclan.example.paintzServer.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PaintRepository paintRepository;

    @Autowired
    UserAccountRepository userAccountRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        Paint hEmeraldGreen = new Paint(ManufacturerType.HUMBROL, "02", "AA0028", "Enamel Gloss Emerald Green", PaintType.ENAMEL, ColourType.GREEN, "005B40", "14ML");
        paintRepository.save(hEmeraldGreen);

        Paint hTrainerYellow = new Paint(ManufacturerType.HUMBROL, "24", "AA0268", "Enamel Matt Trainer Yellow", PaintType.ENAMEL, ColourType.YELLOW, "FECC14", "14ML");
        paintRepository.save(hTrainerYellow);

        Paint rTrainerYellow = new Paint(ManufacturerType.REVELL, "24", "AA0268", "Enamel Matt Trainer Yellow", PaintType.ENAMEL, ColourType.YELLOW, "FECC14", "14ML");
        paintRepository.save(rTrainerYellow);

        UserAccount heather = new UserAccount("heather@test.com", "password");
        userAccountRepository.save(heather);

//        UserAccount admin = new UserAccount("admin@test.com", passwordEncoder.encode("admin"));
//        userAccountRepository.save(admin);

    }
}
