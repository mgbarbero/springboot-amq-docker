package bo.com.mc4.jms.client;

public interface JmsClient {
	public void send(String msg);
	public String receive();
}
