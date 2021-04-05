package lwj.study.designmodel.ChainOfResponsibility;

/**
 * Created by Administrator on 2021/4/4.
 */
public abstract class Approver {
    public Approver approver;
    private String name;

    public Approver(String name) {
        this.approver = approver;
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
