package a_Zadania.b_Dzien_2.b_Wzorce_projektowe;

public class AppConfig {

	private static AppConfig INSTANCE;
	private String host;
	private int port;
	private int timeout;

	AppConfig() {
		host = "coderslab.pl";
		port = 8080;
		timeout = 2000;
	}

	public static synchronized AppConfig getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new AppConfig();
		}
		return INSTANCE;
	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}

	public int getTimeout() {
		return timeout;
	}

}
