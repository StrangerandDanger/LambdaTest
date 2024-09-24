import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach
{
    public static void assignment2()
    {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            stringList.add("HelloJava" + i);
        }
        for(String s:stringList)
        {
            System.out.println(s);
        }
        stringList.forEach(System.out :: print);
    }


}
