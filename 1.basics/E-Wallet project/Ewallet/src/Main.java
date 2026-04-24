import Service.EwalletApplicationService;
import Service.impl.EwalletApplicationServiceImpl;


public class Main {
    public static void main(String[] args){

        EwalletApplicationService ew =new EwalletApplicationServiceImpl();
            ew.start();
    }
}
