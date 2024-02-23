package ua.prosin.hw12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvBuilder {
    private static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void buildCsvContent(StringBuilder csvContent) throws IOException {
        while (true) {
            String line = readInput();


            if (line.equals("next")) {
                csvContent.append("\n");
            } else if (line.equals("end")) {
                break;
            } else {
                csvContent.append(line).append(",");
            }
        }
    }

    private static void writeCsvFile(String csvText) throws IOException {
        File csvFile = new File("output.csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
            writer.write(csvText);
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder csvContent = new StringBuilder();
        System.out.println("Write your text here:");
        buildCsvContent(csvContent);
        String csvText = csvContent.toString().substring(0, csvContent.length() - 1);
        writeCsvFile(csvText);
        System.out.println("CSV file created!");
    }
}
