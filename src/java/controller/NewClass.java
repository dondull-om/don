/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author dondull
 */
public class NewClass {
    

    public static void main(String[] args) {
        String inputText = "Hôm nay là 01/10/2024 và ngày mai là 02/10/2024.";
        String outputText = convertDatesInText(inputText);
        
        System.out.println("Văn bản gốc: " + inputText);
        System.out.println("Văn bản phiên âm: " + outputText);
    }

    public static String convertDatesInText(String text) {
        String regex = "(\\d{1,2}/\\d{1,2}/\\d{4})"; // Định dạng dd/MM/yyyy
        Matcher matcher = Pattern.compile(regex).matcher(text);
        
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String dateStr = matcher.group();
            String vietnameseDate = convertDateToVietnamese(dateStr);
            matcher.appendReplacement(result, vietnameseDate);
        }
        
        matcher.appendTail(result);
        return result.toString();
    }

    public static String convertDateToVietnamese(String dateStr) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        try {
            calendar.setTime(inputFormat.parse(dateStr));
        } catch (ParseException e) {
            return "Ngày không hợp lệ";
        }

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        return "ngày " + convertNumberToPronunciation(day) + " tháng " +
                convertMonthToVietnamese(month) + " năm " +
                convertNumberToPronunciation(year % 100);
    }

    public static String convertNumberToPronunciation(int number) {
        String[] units = {
                "", "một", "hai", "ba", "bốn", "năm", "sáu", 
                "bảy", "tám", "chín", "mười", "mười một", 
                "mười hai", "mười ba", "mười bốn", "mười lăm", 
                "mười sáu", "mười bảy", "mười tám", "mười chín", 
                "hai mươi", "hai mươi một", "hai mươi hai", 
                "hai mươi ba", "hai mươi bốn", "hai mươi lăm", 
                "hai mươi sáu", "hai mươi bảy", "hai mươi tám", 
                "hai mươi chín", "ba mươi", "ba mươi một"
        };

        if (number < 0 || number >= units.length) {
            return "Số không hợp lệ";
        }

        return units[number];
    }

    public static String convertMonthToVietnamese(int month) {
        String[] months = {
                "giêng", "hai", "ba", "bốn", "năm", 
                "sáu", "bảy", "tám", "chín", "mười", 
                "mười một", "mười hai"
        };

        if (month < 0 || month >= months.length) {
            return "Tháng không hợp lệ";
        }

        return months[month];
    }
}


