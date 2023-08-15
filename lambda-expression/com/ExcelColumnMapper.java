package com;

import java.util.HashMap;
import java.util.Map;

public class ExcelColumnMapper {
    public static void main(String[] args) {
    	ExcelColumnMapper.getColumnLetter(1);
        String[] headers = {
            "Date", "Furnace name", "Operator Name", "Part name", "Part weight", "Opn", "Prod Qty",
            "Production Weight", "Accp Qty", "CD", "Rejection Weight", "CD1", "Rw Qty", "OK PART HEAT NO",
            "Not ok part heat number", "Un Fill", "Blow Holes", "Under Cut", "Crack", "Letter Problem",
            "Die Catch Mark", "Leak", "Bend", "Damage", "Shrinkage", "Pin Holes", "Wall thickness issue",
            "Core Problem", "SLAG", "Die coate problem", "Core Shift", "Heat Number Problem", "SAND DROP",
            "Colour Variation", "Fettiling Problem", "Dimention Problem", "COATING INCLUSION", "Ejection pin depth",
            "Core", "missmatch", "WAMAP SHOT 1ST CASTING", "Casting Porocity", "RT FAIL", "CUT SECTION", "REWORK",
            "HARD HARDNESS", "REMARKS"
        };

        Map<String, String> headerToExcelColumnMap = new HashMap<>();
        for (int i = 0; i < headers.length; i++) {
            headerToExcelColumnMap.put(headers[i], getColumnLetter(i + 1));
        }

        // Print the generated mapping
        for (Map.Entry<String, String> entry : headerToExcelColumnMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Method to get Excel column letters (A, B, C, ... Z, AA, AB, ...)
    private static String getColumnLetter(int colNum) {
        StringBuilder colLetters = new StringBuilder();
        while (colNum > 0) {
            int remainder = (colNum - 1) % 26;
            colLetters.insert(0, (char) ('A' + remainder));
            colNum = (colNum - 1) / 26;
        }
        return colLetters.toString();
    }
}
