/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DIRECTORY", schema = "TEST")
public class T_DIRECTORY_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable {

	private static final long serialVersionUID = -415288281;

	private java.lang.Integer ID;
	private java.lang.Integer PARENT_ID;
	private java.lang.Integer IS_DIRECTORY;
	private java.lang.String  name;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "PARENT_ID", precision = 7)
	public java.lang.Integer getPARENT_ID() {
		return this.PARENT_ID;
	}

	public void setPARENT_ID(java.lang.Integer PARENT_ID) {
		this.PARENT_ID = PARENT_ID;
	}

	@javax.persistence.Column(name = "IS_DIRECTORY", precision = 7)
	public java.lang.Integer getIS_DIRECTORY() {
		return this.IS_DIRECTORY;
	}

	public void setIS_DIRECTORY(java.lang.Integer IS_DIRECTORY) {
		this.IS_DIRECTORY = IS_DIRECTORY;
	}

	@javax.persistence.Column(name = "name", length = 50)
	public java.lang.String getname() {
		return this.name;
	}

	public void setname(java.lang.String name) {
		this.name = name;
	}
}