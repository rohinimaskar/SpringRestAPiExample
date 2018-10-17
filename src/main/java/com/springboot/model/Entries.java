package com.springboot.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Entries {
    @JsonProperty("glossary")
    private List<Glossary> glossary;

    public List<Glossary> getGlossary() {
		return glossary;
	}

	public void setGlossary(List<Glossary> glossary) {
		this.glossary = glossary;
	}


}
