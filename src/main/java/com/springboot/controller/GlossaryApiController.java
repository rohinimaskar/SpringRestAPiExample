package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.model.Entries;
import com.springboot.model.Glossary;

@RestController
@RequestMapping("/api")
public class GlossaryApiController {

	public static final Logger logger = LoggerFactory.getLogger(GlossaryApiController.class);
	final String uri = "https://www.healthcare.gov/api/glossary.json";

	private RestTemplate restTemplate;

	@Autowired
	public GlossaryApiController(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	@RequestMapping(value = "/glossary", method = RequestMethod.GET)
	public ResponseEntity<Entries> listAllGlossaries() {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Entries> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, Entries.class);
		Entries objects = responseEntity.getBody();

		return new ResponseEntity<Entries>(objects, HttpStatus.OK);
	}

	@RequestMapping(value = "/glossary/{lang}", method = RequestMethod.GET)
	public ResponseEntity<Entries> getGlossaryByLang(@PathVariable String lang) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Entries> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, Entries.class);
		Entries objects = responseEntity.getBody();

		List<Glossary> gs = objects.getGlossary();
		List<Glossary> newgs = new ArrayList<Glossary>();

		for (Glossary g : gs) {
			if (g.getLang().equalsIgnoreCase(lang)) {
				newgs.add(g);
			}
		}
		Entries e = new Entries();
		e.setGlossary(newgs);
		return new ResponseEntity<Entries>(e, HttpStatus.OK);
	}

}