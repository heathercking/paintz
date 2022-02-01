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

        Paint hEmeraldGreen = new Paint(ManufacturerType.HUMBROL,"02","AA0175","Humbrol Gloss Emerald Green",PaintType.ENAMEL,ColourType.GREEN,"005B40","14ML");
        paintRepository.save(hEmeraldGreen);
        Paint hSilver = new Paint(ManufacturerType.HUMBROL,"11","AA0176","Humbrol Metal Silver",PaintType.ENAMEL,ColourType.GREY,"9B9D9F","14ML");
        paintRepository.save(hSilver);
        Paint hFrenchBlue = new Paint(ManufacturerType.HUMBROL,"14","AA0177","Humbrol Gloss French blue",PaintType.SPRAY_ACRYLIC,ColourType.BLUE,"0F7BB3","200ML");
        paintRepository.save(hFrenchBlue);
        Paint hBrightRed = new Paint(ManufacturerType.HUMBROL,"19","AA0178","Humbrol Gloss Bright Red",PaintType.ENAMEL,ColourType.RED,"CD4F3A","14ML");
        paintRepository.save(hBrightRed);
        Paint hDuckEggBlue = new Paint(ManufacturerType.HUMBROL,"23","AA0299","Humbrol Matt Duck egg blue",PaintType.ENAMEL,ColourType.BLUE,"BCD0A7","14ML");
        paintRepository.save(hDuckEggBlue);
        Paint hKhaki = new Paint(ManufacturerType.HUMBROL,"26","AA0268","Humbrol Matt Khaki",PaintType.ACRYLIC,ColourType.YELLOW,"A79656","50ML");
        paintRepository.save(hKhaki);
        Paint hDarkEarth = new Paint(ManufacturerType.HUMBROL,"29","AA0326","Humbrol Matt Dark Earth",PaintType.ENAMEL,ColourType.YELLOW,"AB8957","14ML");
        paintRepository.save(hDarkEarth);
        Paint hBlack = new Paint(ManufacturerType.HUMBROL,"33","AA0044","Humbrol Matt Black",PaintType.ENAMEL,ColourType.BLACK,"333231","14ML");
        paintRepository.save(hBlack);
        Paint hFlatWhite = new Paint(ManufacturerType.HUMBROL,"34","AA0037","Humbrol Matt Flat White",PaintType.ENAMEL,ColourType.WHITE,"FFFFFF","14ML");
        paintRepository.save(hFlatWhite);
        Paint hGunmetal = new Paint(ManufacturerType.HUMBROL,"53","AA5252","Humbrol Metal Gunmetal",PaintType.ENAMEL,ColourType.GREY,"A9AAAD","14ML");
        paintRepository.save(hGunmetal);
        Paint hFlesh = new Paint(ManufacturerType.HUMBROL,"61","AA0057","Humbrol Matt Matt Flesh",PaintType.ACRYLIC,ColourType.YELLOW,"FEDCB8","50ML");
        paintRepository.save(hFlesh);
        Paint hTankGrey = new Paint(ManufacturerType.HUMBROL,"67","AA0775","Humbrol Matt Tank Grey",PaintType.ENAMEL,ColourType.GREY,"56594F","14ML");
        paintRepository.save(hTankGrey);
        Paint hRafBlue = new Paint(ManufacturerType.HUMBROL,"96","AA1033","Humbrol Matt RAF Blue",PaintType.SPRAY_ACRYLIC,ColourType.BLUE,"65829A","200ML");
        paintRepository.save(hRafBlue);
        Paint hChocolate = new Paint(ManufacturerType.HUMBROL,"98","AA1047","Humbrol Matt Chocolate",PaintType.ENAMEL,ColourType.GREEN,"5D483E","14ML");
        paintRepository.save(hEmeraldGreen);
        Paint hSatinWhite = new Paint(ManufacturerType.HUMBROL,"130","AA2240","Humbrol Satin White",PaintType.ENAMEL,ColourType.WHITE,"F3F2EC","14ML");
        paintRepository.save(hSatinWhite);
        Paint hGermanCamouflageRedBrown = new Paint(ManufacturerType.HUMBROL,"160","AA7224","Humbrol Matt German Camouflage Red Brown",PaintType.ACRYLIC,ColourType.GREEN,"393227","50ML");
        paintRepository.save(hGermanCamouflageRedBrown);
        Paint hRAFHemp = new Paint(ManufacturerType.HUMBROL,"168","AA7226","Humbrol RAF Hemp",PaintType.ENAMEL,ColourType.GREEN,"B6A690","14ML");
        paintRepository.save(hRAFHemp);
        Paint hFerrariRed = new Paint(ManufacturerType.HUMBROL,"220","AA7227","Humbrol Gloss Ferrari Red",PaintType.ENAMEL,ColourType.RED,"C4151C","14ML");
        paintRepository.save(hFerrariRed);
        Paint hGold = new Paint(ManufacturerType.HUMBROL,"16","AA7228","Humbrol Metal Gold",PaintType.ACRYLIC,ColourType.YELLOW,"C5A971","50ML");
        paintRepository.save(hGold);
        Paint hPurple = new Paint(ManufacturerType.HUMBROL,"68","AA7229","Humbrol Gloss Purple",PaintType.ENAMEL,ColourType.VIOLET,"744E7A","14ML");
        paintRepository.save(hPurple);
        Paint hPink = new Paint(ManufacturerType.HUMBROL,"200","AA7230","Humbrol Gloss Pink",PaintType.ENAMEL,ColourType.RED,"E7C1BB","14ML");
        paintRepository.save(hPink);
        Paint rEmeraldGreen = new Paint(ManufacturerType.REVELL,"61","31724","Revell Gloss Emerald Green",PaintType.ENAMEL,ColourType.GREEN,"005B40","14ML");
        paintRepository.save(rEmeraldGreen);
        Paint rSilver = new Paint(ManufacturerType.REVELL,"90","32321","Revell Metallic Silver",PaintType.ENAMEL,ColourType.GREY,"9B9D9F","14ML");
        paintRepository.save(rSilver);
        Paint rBlue = new Paint(ManufacturerType.REVELL,"52","32152","Revell Gloss Blue",PaintType.SPRAY_ACRYLIC,ColourType.BLUE,"0F7BB3","200ML");
        paintRepository.save(rBlue);
        Paint rFireRed = new Paint(ManufacturerType.REVELL,"31","32212","Revell Gloss Fire Red",PaintType.ENAMEL,ColourType.RED,"CD4F3A","14ML");
        paintRepository.save(rFireRed);
        Paint rKhakiBrown = new Paint(ManufacturerType.REVELL,"86","37267","Revell Flat Khaki Brown",PaintType.ACRYLIC,ColourType.YELLOW,"A79656","50ML");
        paintRepository.save(rKhakiBrown);
        Paint rEarthBrown = new Paint(ManufacturerType.REVELL,"87","32767","Revell Flat Earth Brown",PaintType.ENAMEL,ColourType.YELLOW,"AB8957","14ML");
        paintRepository.save(rEarthBrown);
        Paint rBlack = new Paint(ManufacturerType.REVELL,"08","32330","Revell Flat Black",PaintType.ENAMEL,ColourType.BLACK,"333231","14ML");
        paintRepository.save(rBlack);
        Paint rWhite = new Paint(ManufacturerType.REVELL,"05","32790","Revell Flat White",PaintType.ENAMEL,ColourType.WHITE,"FFFFFF","14ML");
        paintRepository.save(rWhite);
        Paint rFlesh = new Paint(ManufacturerType.REVELL,"35","33600","Revell Flat Flesh",PaintType.ACRYLIC,ColourType.YELLOW,"FEDCB8","50ML");
        paintRepository.save(rFlesh);
        Paint rTankGrey = new Paint(ManufacturerType.REVELL,"78","32660","Revell Flat Tank Grey",PaintType.ENAMEL,ColourType.GREY,"56594F","14ML");
        paintRepository.save(rTankGrey);
        Paint rGreyishBlue = new Paint(ManufacturerType.REVELL,"79","32711","Revell Flat Greyish Blue",PaintType.SPRAY_ACRYLIC,ColourType.BLUE,"65829A","200ML");
        paintRepository.save(rGreyishBlue);
        Paint rGlossWhite = new Paint(ManufacturerType.REVELL,"301","32780","Revell Semi Gloss White",PaintType.ENAMEL,ColourType.WHITE,"F3F2EC","14ML");
        paintRepository.save(rGlossWhite);
        Paint rFerrariRed = new Paint(ManufacturerType.REVELL,"34","32007","Revell Gloss Ferrari Red",PaintType.ENAMEL,ColourType.RED,"C4151C","14ML");
        paintRepository.save(rFerrariRed);
        Paint rGold = new Paint(ManufacturerType.REVELL,"94","32122","Revell Metallic Gold",PaintType.ACRYLIC,ColourType.YELLOW,"C5A971","50ML");
        paintRepository.save(rGold);
        Paint tGreen = new Paint(ManufacturerType.TAMIYA,"X-5","81006","Tamiya Green",PaintType.ENAMEL,ColourType.GREEN,"005B40","14ML");
        paintRepository.save(tGreen);
        Paint tSilver = new Paint(ManufacturerType.TAMIYA,"X-11","81012","Tamiya Chrome Silver",PaintType.ENAMEL,ColourType.GREY,"9B9D9F","14ML");
        paintRepository.save(tSilver);
        Paint tBlue = new Paint(ManufacturerType.TAMIYA,"X-4","81005","Tamiya Blue",PaintType.SPRAY_ACRYLIC,ColourType.BLUE,"0F7BB3","200ML");
        paintRepository.save(tBlue);
        Paint tRed = new Paint(ManufacturerType.TAMIYA,"X-7","81008","Tamiya Red",PaintType.ENAMEL,ColourType.RED,"CD4F3A","14ML");
        paintRepository.save(tRed);
        Paint tSky = new Paint(ManufacturerType.TAMIYA,"XF-21","81322","Tamiya Sky",PaintType.ENAMEL,ColourType.BLUE,"BCD0A7","14ML");
        paintRepository.save(tSky);
        Paint tKhaki = new Paint(ManufacturerType.TAMIYA,"XF-49","81350","Tamiya Khaki",PaintType.ACRYLIC,ColourType.YELLOW,"A79656","50ML");
        paintRepository.save(tKhaki);
        Paint tEarth = new Paint(ManufacturerType.TAMIYA,"XF-52","81353","Tamiya Flat Earth",PaintType.ENAMEL,ColourType.YELLOW,"AB8957","14ML");
        paintRepository.save(tEarth);
        Paint tBlack = new Paint(ManufacturerType.TAMIYA,"XF-1","81302","Tamiya Flat Black",PaintType.ENAMEL,ColourType.BLACK,"333231","14ML");
        paintRepository.save(tBlack);
        Paint tWhite = new Paint(ManufacturerType.TAMIYA,"XF-2","81303","Tamiya Flat White",PaintType.ENAMEL,ColourType.WHITE,"FFFFFF","14ML");
        paintRepository.save(tWhite);
        Paint tGunMetal = new Paint(ManufacturerType.TAMIYA,"X-10","81011","Tamiya Gun Metal",PaintType.ENAMEL,ColourType.GREY,"A9AAAD","14ML");
        paintRepository.save(tGunMetal);
        Paint tFlesh = new Paint(ManufacturerType.TAMIYA,"XF-15","81316","Tamiya Flat Flesh",PaintType.ACRYLIC,ColourType.YELLOW,"FEDCB8","50ML");
        paintRepository.save(tFlesh);
        Paint tGermanGrey = new Paint(ManufacturerType.TAMIYA,"XF-63","81364","Tamiya German Grey",PaintType.ENAMEL,ColourType.GREY,"56594F","14ML");
        paintRepository.save(tGermanGrey);
        Paint tMediumBlue = new Paint(ManufacturerType.TAMIYA,"XF-18","81319","Tamiya Medium Blue",PaintType.SPRAY_ACRYLIC,ColourType.BLUE,"65829A","200ML");
        paintRepository.save(tMediumBlue);
        Paint fBrown = new Paint(ManufacturerType.TAMIYA,"XF-10","81311","Tamiya Flat Brown",PaintType.ENAMEL,ColourType.GREEN,"5D483E","14ML");
        paintRepository.save(fBrown);
        Paint tRedBrown = new Paint(ManufacturerType.TAMIYA,"XF-64","81365","Tamiya Red Brown",PaintType.ACRYLIC,ColourType.GREEN,"393227","50ML");
        paintRepository.save(tRedBrown);
        Paint tBuff = new Paint(ManufacturerType.TAMIYA,"XF-57","81358","Tamiya Buff",PaintType.ENAMEL,ColourType.GREEN,"B6A690","14ML");
        paintRepository.save(tBuff);
        Paint tGoldLeaf = new Paint(ManufacturerType.TAMIYA,"X-12","81013","Tamiya Gold Leaf",PaintType.ACRYLIC,ColourType.YELLOW,"C5A971","50ML");
        paintRepository.save(tGoldLeaf);
        Paint tPurple = new Paint(ManufacturerType.TAMIYA,"X-16","81017","Tamiya Purple",PaintType.ENAMEL,ColourType.VIOLET,"744E7A","14ML");
        paintRepository.save(tPurple);
        Paint tPink = new Paint(ManufacturerType.TAMIYA,"X-17","81018","Tamiya Pink",PaintType.ENAMEL,ColourType.RED,"E7C1BB","14ML");
        paintRepository.save(tPink);

    }
}
