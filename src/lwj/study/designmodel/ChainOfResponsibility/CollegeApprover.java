package lwj.study.designmodel.ChainOfResponsibility;

/**
 * Created by Administrator on 2021/4/4.
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000){
            System.out.println("请求编号"+purchaseRequest.getId());
            System.out.println("CollegeApprover 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
