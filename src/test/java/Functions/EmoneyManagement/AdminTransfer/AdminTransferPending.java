package Functions.EmoneyManagement.AdminTransfer;

import org.openqa.selenium.By;
import Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation;

public class AdminTransferPending {

    private static final  String txnId = AdminTransferCreation.getTxnId();
    public static  final By PENDING_ADMIN_TRANSFER = By.xpath("//*[@translate='general_label_pending_admin_transfers']");
    public static final By SEARCH_BY_FILTER_CRITERIA = By.xpath("//*[@translate='view_search_by_criteria']");
    public static final By TRANSACTION_ID = By.xpath("//*[@id='transactionIdInput']");
    public static final By SEARCH = By.xpath("//*[@ng-click='searchTransactions()']");

    public static String getTxnId() {
        return txnId;
    }
}
