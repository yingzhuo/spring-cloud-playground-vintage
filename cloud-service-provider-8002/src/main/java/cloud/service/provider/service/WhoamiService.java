package cloud.service.provider.service;

public interface WhoamiService {

    public String whoami();

    public String slowWhoami();

    public String verySlowWhoami();

    public String badWhoami(int param);

}
