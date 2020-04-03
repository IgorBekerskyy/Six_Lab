package ua.lviv.iot;

import org.junit.Test;
import ua.lviv.iot.ShuttleMissionsSearcher;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ShuttleMissionsSearcherTest {
  @Test
  public void findShuttleTest() {

    String text = "The first flight of a reusable ship - <STS>_<1>. The flight was the 12th for Space Shuttle Atlantis - "
        + "<STS_Atlantis>_<46>. In 1993  was mission <STS_Indevor>_<57>  ";
    InputStream in = new ByteArrayInputStream(text.getBytes());
    System.setIn(in);

    Scanner scanner = new Scanner(System.in);
    String myText = scanner.nextLine();
    System.out.println(myText);
    ShuttleMissionsSearcher.findShuttlesByName(myText);
  }

}