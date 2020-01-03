package com.springboot.dtos;

public class ClientDto {
	private Long id;
	private String name;
	private String url;
	private String domain;
	private String scKey;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getScKey() {
		return scKey;
	}

	public void setScKey(String scKey) {
		this.scKey = scKey;
	}

}
