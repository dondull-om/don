/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dondull
 */
public class abbreviated {

    public static String convertAbbreviationsToPronunciation(String text) {
        // Map chứa các từ viết tắt và phiên âm tương ứng
        Map<String, String> abbreviationMap = new HashMap<>();
        abbreviationMap.put("USD", "u ét đi");
        abbreviationMap.put("VND", "vê nờ đê");
        abbreviationMap.put("NHNN", "ngân hàng nhà nước");
        abbreviationMap.put(" - ", " và ");
        abbreviationMap.put("-", " tới ");

        // Chuyển đổi các từ viết tắt trong văn bản
        for (Map.Entry<String, String> entry : abbreviationMap.entrySet()) {
            text = text.replaceAll("(?i)" + entry.getKey(), entry.getValue());
        }

        return text;
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



    public static String convertToLowerCase(String text) {
        // Chuyển đổi tất cả các ký tự trong chuỗi thành chữ thường
        return text.toLowerCase();
    }

    
    
    public static String convertTextToPronunciation(String text) {
        // Chuyển đổi từ viết tắt
        text = convertAbbreviationsToPronunciation(text);
        text = convertDatesInText(text);

        text = convertToLowerCase(text);

        return text;
    }

    public static void main(String[] args) {
        String inputText = "Tỷ giá trung tâm giữa đồng Việt Nam và đô la Mỹ (USD) được NHNN công bố hôm 22/9 ở mức 24.060 đồng mỗi USD. Giá USD tại các ngân hàng thương mại hôm 23/9 được giao dịch quanh mức 24.160-24.530 đồng/USD (mua vào - bán ra).";
        String convertedText = convertTextToPronunciation(inputText);

        System.out.println("Original: " + inputText);
        System.out.println("Converted: " + convertedText);
    }
}
