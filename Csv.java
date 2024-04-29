import java.util.*;

import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;

public class Csv {

    void saveVoterData(String name, int age, int id, String address, String candidateName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("voters_data.csv", true))) {
            writer.write(name + "," + age + "," + id + "," + address + ',' + candidateName);
            writer.newLine(); // Move to the next line after writing the current voter's data
            writer.close(); // Always close the writer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
