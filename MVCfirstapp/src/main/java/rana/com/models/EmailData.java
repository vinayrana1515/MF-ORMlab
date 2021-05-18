package rana.com.models;

public class EmailData {

	private String mailsender;
	private String message;
	private String subject;
	private String filename;
	public String getMailsender() {
		return mailsender;
	}
	public void setMailsender(String mailsender) {
		this.mailsender = mailsender;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}
