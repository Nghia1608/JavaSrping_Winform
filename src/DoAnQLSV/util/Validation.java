/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnQLSV.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kshin
 */
public class Validation {

    public static boolean isEmail(String email) {
    String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
 
Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(email);
  if(matcher.matches())
  {
      return true;
}else{
      return false;
  
}}
}