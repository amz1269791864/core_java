package 模板;

public class MuBanService {

    private MuBanCla muBanCla;

    public MuBanService(MuBanCla muBanCla) {
        this.muBanCla = muBanCla;
    }

    public void test(){
        muBanCla.huijia();
    }
}
