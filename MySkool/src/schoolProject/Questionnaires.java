package schoolProject;
// Generated Oct 4, 2018 10:30:23 AM by Hibernate Tools 5.1.8.Final

/**
 * Questionnaires generated by hbm2java
 */
public class Questionnaires implements java.io.Serializable {

	private Integer idQuest;
	private Integer typeQuest;
	private String question;
	private String response;

	public Questionnaires() {
	}

	public Questionnaires(Integer typeQuest, String question, String response) {
		this.typeQuest = typeQuest;
		this.question = question;
		this.response = response;
	}

	public Integer getIdQuest() {
		return this.idQuest;
	}

	public void setIdQuest(Integer idQuest) {
		this.idQuest = idQuest;
	}

	public Integer getTypeQuest() {
		return this.typeQuest;
	}

	public void setTypeQuest(Integer typeQuest) {
		this.typeQuest = typeQuest;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}