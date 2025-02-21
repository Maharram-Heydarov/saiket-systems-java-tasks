package com.saiketsystems.textfileanalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileAnalyzer {
    private final List<String> lines;

    public FileAnalyzer(String filePath) throws IOException {
        lines = Files.readAllLines(Paths.get(filePath));
    }

    public int countLines() {
        return lines.size();
    }

    public int countWords() {
        return (int) lines.stream()
                .flatMap(line -> List.of(line.split("\\s+")).stream())
                .filter(word -> !word.isBlank())
                .count();
    }

    public int countCharacters() {
        return lines.stream().mapToInt(String::length).sum();
    }

    public List<String> getLines() {
        return lines;
    }
}
