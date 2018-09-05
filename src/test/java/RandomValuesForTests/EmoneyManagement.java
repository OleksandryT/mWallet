package RandomValuesForTests;

import org.openqa.selenium.By;

public interface EmoneyManagement {

    By EMONEY_MANAGEMENT = By.xpath("//*[@translate=\"general_label_emoney_management\"]");
    void setEmoneyManagement();

    By FIRST_ROW_WITH_TRANSACTION = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[1]");
    void setFirstRowWithTransaction();

    By DETAILS = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[9]/a");
    void setDetails();
}
