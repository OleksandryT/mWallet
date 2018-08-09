import org.apache.commons.lang3.RandomStringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class RandomValues {

    String randomAlphabetic = RandomStringUtils.randomAlphabetic(10);
    String randomNumber = RandomStringUtils.randomNumeric(12);
    String randomAlphaNumeric= RandomStringUtils.randomAlphanumeric(10);


    public static String generateEmail(int length) {
        String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
                "1234567890" +   //numbers
                "_-.";   //special characters
        String email="";
        String temp=RandomStringUtils.random(length,allowedChars);
        email=temp.substring(0,temp.length()-9)+"@test.org";
        return email;
    }

    public static String generateUrl(int length) {
        String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
                "1234567890" +   //numbers
                "_-.";   //special characters
        String url="";
        String temp=RandomStringUtils.random(length,allowedChars);
        url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
        return url;
    }

    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    String calendarDate = dateFormat.format(new Date());

}
