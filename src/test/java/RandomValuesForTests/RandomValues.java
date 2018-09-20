package RandomValuesForTests;

import org.apache.commons.lang3.RandomStringUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class RandomValues {

    public static final String RANDOM_ALPHABETIC = RandomStringUtils.randomAlphabetic(10);
    public static final String RANDOM_NUMBER_MSISDN = "38067"+ RandomStringUtils.randomNumeric(7);
    public static final String RANDOM_NUMBER = RandomStringUtils.randomNumeric(6);
    public static final String RANDOM_ALPHA_NUMERIC = RandomStringUtils.randomAlphanumeric(10);
    public static final String DAYS_FOR_REFUND = "5.5";

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    public static final String CALENDAR_DATE = DATE_FORMAT.format(new Date());

    public static final String RANDOM_STRING () {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < 9; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
       return   buffer.toString();
    }

    public static final String GENERATE_EMAIL(int length) {
        String allowedChars="abcdefghijklmnopqrstuvwxyz" +
                "1234567890" +
                "_-.";
        String email="";
        String temp=RandomStringUtils.random(length,allowedChars);
        email=temp.substring(0,temp.length()-9)+"@test.org";
        return email;
    }

    public static final String GENERATE_URL(int length) {
        String allowedChars="abcdefghijklmnopqrstuvwxyz" +
                "1234567890" +
                "_-.";
        String url="";
        String temp=RandomStringUtils.random(length,allowedChars);
        url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
        return url;
    }


}
