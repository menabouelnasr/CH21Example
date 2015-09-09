package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TODOLIST database table.
 * 
 */
@Entity
@Table(name="TODOLIST", schema="TESTDB")
@NamedQuery(name="Todolist.findAll", query="SELECT t FROM Todolist t")
public class Todolist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String complete;

	private String descr;

	private String due;

	private String name;

	private String priority;

	private String statusid;

	private String userid;

	public Todolist() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComplete() {
		return this.complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDue() {
		return this.due;
	}

	public void setDue(String due) {
		this.due = due;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatusid() {
		return this.statusid;
	}

	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}