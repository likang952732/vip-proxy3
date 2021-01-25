package com.example.vipproxy3;

import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Pattern;

/*
 @Description 将sql中的参数替换掉对应的?
 *@author kang.li
 *@date 2021/1/21 18:17   
 */
public class SqlParamTest {
    public static void main(String[] args) throws Exception{
        File file = ResourceUtils.getFile("classpath:sql.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String linetxt = null;
        while ((linetxt = bufferedReader.readLine()) != null) {
            sb.append(linetxt);
        }
        String sbStr = sb.toString();
        String orderSql = sbStr.substring(0, sbStr.lastIndexOf("?") + 1);
        String Sql2 = sbStr.substring(sbStr.lastIndexOf("?")+1, sbStr.length());
        String[] sp2 = Sql2.split(",");
        String t = null;
        for (int i = 0; i < sp2.length; i++){
            if(!isInteger(sp2[i].trim())) {
                sp2[i] = "'" + sp2[i] + "'";
            }
            orderSql = orderSql.replaceFirst("\\?", sp2[i]);
        }
        System.out.println("替换好的sql: " + orderSql);
    }

    private static boolean isInteger(String str) {
        String reg = "[0-9]*";
        Pattern pattern = Pattern.compile(reg);
        return pattern.matcher(str).matches();
    }
}
