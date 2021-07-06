package com.asde.dbconnect.demo;

import com.asde.dbconnect.service.ISlotService;
import com.asde.dbconnect.service.SlotService;
import com.asde.file.FileReadingServiceImpl;
import com.asde.file.IFileReadingService;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Demo {
    public static void main(String[] args) throws IOException {
//        String filelName = "src/main/resources/vaccinecentredata.csv";
//        IFileReadingService fileReadingService = new FileReadingServiceImpl();
//        System.out.println(fileReadingService.readVaccinCentreData(filelName).size());
//
//        ISlotService slotService = new SlotService(new FileReadingServiceImpl(), "src/main/resources/vaccinecentredata.csv");
//        assertTrue(slotService.getAllAvailableSlots().size() == 5);

        ISlotService slotService = new SlotService(new FileReadingServiceImpl(), "src/main/resources/vaccinecentredata.csv");
        System.out.println(slotService.getAllAvailableSlots().size());
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/vaccinecentredata.csv"));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            // vaccinetype,location,availability,slots
//                String[] row = line.split(",");
//            System.out.println(line);
//        }
//        bufferedReader.close();
    }
}
