package yanagishima.config;

public class YanagishimaConfig {
	
	private int jettyPort;
	
	private String webResourceDir;

	private String prestoCoordinatorServer;
	
	private String catalog;
	
	private String schema;
	
	private String user;
	
	private String source;
	
	private int selectLimit;
	
	public YanagishimaConfig(int jettyPort, String webResourceDir,
			String prestoCoordinatorServer, String catalog, String schema, String user, String source, int selectLimit) {
		this.jettyPort = jettyPort;
		this.webResourceDir = webResourceDir;
		this.prestoCoordinatorServer = prestoCoordinatorServer;
		this.catalog = catalog;
		this.schema = schema;
		this.user = user;
		this.source = source;
		this.selectLimit = selectLimit;
	}
	
	public int getJettyPort() {
		return jettyPort;
	}

	public String getWebResourceDir() {
		return webResourceDir;
	}

	public String getPrestoCoordinatorServer() {
		return prestoCoordinatorServer;
	}

	public String getCatalog() {
		return catalog;
	}

	public String getSchema() {
		return schema;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getSource() {
		return source;
	}

	public int getSelectLimit() {
		return selectLimit;
	}

}
