package net.jhayden.tmvpofed.model;

import java.util.Comparator;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import net.jhayden.tmvpofed.util.Strings;

/**
 * Member entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MEMBER", schema = "APP")
public class Member implements java.io.Serializable {
	public enum SortBy implements Comparator<Member> {
		NAME {
			@Override
			public int compare(Member m1, Member m2) {
				return m1.getName().toUpperCase(Locale.CANADA).compareTo(m2.getName().toUpperCase(Locale.CANADA));
			}
		};
	}
	
	public static final Member NULL = new Member("NULL", "");
	static {
		NULL.setId(Integer.valueOf(0));
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 170163889650832267L;

	// Fields
	
	private Integer id;
	private String name;
	private String email;

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** full constructor */
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 127)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = Strings.trim(name);
	}

	@Column(name = "EMAIL", nullable = false, length = 127)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = Strings.trim(email);
	}

	@Override
	public String toString() {
		return String.format("%s %s %s",  getId(), getName(), getEmail());
	}
}