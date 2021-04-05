package lwj.study.designmodel.ChainOfResponsibility;

/**
 * Created by Administrator on 2021/4/4.
 */
public class ViceSchoolMasterApprover extends Approver {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 15000){
            System.out.println("请求编号"+purchaseRequest.getId());
            System.out.println("ViceSchoolMasterApprover 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
