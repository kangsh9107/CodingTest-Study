package main.java.ingredient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class trim {

    /*
     * README.md 파일 trim
     * 생성일 : 2023-07-10
     */
    public static void main(String[] args) {
        String filePath = "C:\\Users\\K\\IdeaProjects\\CodingTest-Study\\CodingTest-Java\\src\\main\\java\\ingredient\\text.txt";
        String text = readTextFromFile(filePath);

        List<String[]> table = parseTable(text);

        printTable(table);
    }

    private static List<String[]> parseTable(String text) {
        String[] lines = text.split("\n");
        List<String[]> table = new ArrayList<>();

        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("|") && line.endsWith("|")) {
                line = line.substring(1, line.length() - 1); // "|" 제거
                String[] cells = line.split("\\|");
                String[] trimmedCells = new String[cells.length];
                for (int i = 0; i < cells.length; i++) {
                    trimmedCells[i] = cells[i].trim();
                }
                table.add(trimmedCells);
            }
        }

        return table;
    }

    private static void printTable(List<String[]> table) {
        for (String[] row : table) {
            System.out.print("|");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i != row.length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println("|");
        }
    }

    private static String readTextFromFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}
