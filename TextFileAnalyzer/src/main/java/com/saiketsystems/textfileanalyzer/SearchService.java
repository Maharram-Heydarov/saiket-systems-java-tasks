package com.saiketsystems.textfileanalyzer;


import java.util.List;
import java.util.stream.Collectors;

public class SearchService {
    private final List<String> lines;

    public SearchService(List<String> lines) {
        this.lines = lines;
    }

    public List<Integer> searchWord(String word) {
        return lines.stream()
                .filter(line -> line.contains(word))
                .map(lines::indexOf)
                .collect(Collectors.toList());
    }
}
