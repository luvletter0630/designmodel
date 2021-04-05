package lwj.study.designmodel.ChainOfResponsibility;

/**
 * Created by Administrator on 2021/4/4.
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000){
            System.out.println("请求编号"+purchaseRequest.getId());
            System.out.println("DepartmentApprover 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
