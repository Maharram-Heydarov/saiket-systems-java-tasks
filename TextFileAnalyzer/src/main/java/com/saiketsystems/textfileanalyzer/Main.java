package com.saiketsystems.textfileanalyzer;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main <file_path>");
            return;
        }

        String filePath = args[0];
        try {
            FileAnalyzer analyzer = new FileAnalyzer(filePath);
            System.out.println("Lines: " + analyzer.countLines());
            System.out.println("Words: " + analyzer.countWords());
            System.out.println("Characters: " + analyzer.countCharacters());

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter word to search: ");
            String word = scanner.nextLine();
            SearchService searchService = new SearchService(analyzer.getLines());
            System.out.println("Found in line indexes: " + searchService.searchWord(word));
            scanner.close();
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
}
