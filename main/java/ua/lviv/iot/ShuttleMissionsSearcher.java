package ua.lviv.iot;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShuttleMissionsSearcher {

  public static void findShuttlesByName(String textToCheck) {

    List<String> stringList = new LinkedList<>();
    String patternString = "\\W(\\w+)\\W\\_\\W\\d{1,9}\\W";
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(textToCheck);
    while (matcher.find()) {
      stringList.add(matcher.group());
    }
    System.out.println(stringList);

  }

}
