package lwj.study.designmodel.ChainOfResponsibility;

/**
 * Created by Administrator on 2021/4/4.
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,1,2000);
        DepartmentApprover zhang = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("孙副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("赵校长");
        zhang.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(zhang);

        schoolMasterApprover.processRequest(purchaseRequest);
    }


}
