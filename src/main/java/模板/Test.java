package 模板;

public class Test {

    public static void main(String[] args) {
        AMZImpl amz = new AMZImpl();
        MWQImpl mwq = new MWQImpl();
        MuBanService muBanService = new MuBanService(amz);
        MuBanService muBanService1 = new MuBanService(mwq);
        muBanService.test();
        muBanService1.test();
    }
}
