package helpers;

public enum RunWhere {
	LOCAL("local"),
	BROWSERSTACK("browserstack");

	public String runWhere;

	RunWhere(String runWhere) {
		this.runWhere = runWhere;
	}
}
