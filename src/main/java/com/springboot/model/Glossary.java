package com.springboot.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Glossary {

	private String path;

	private String url;

	private String content;

	private String id;
	private String collection;
	private String excerpt;
	private boolean draft;
	private List<String> categories;
	private String experience;
	private boolean published;
	private String title;
    @JsonProperty("meta-title")
	private String metaTitle;
    @JsonProperty("meta-description")
	private String metaDescription;
	private String lang;
	private String layout;

	private List<String> tags;
    @JsonProperty("page_name")
	private String pageName;
    @JsonProperty("page_type")
	private String pageType;
    @JsonProperty("page_topic")
	private String pageTopic;
    @JsonProperty("page_lifecycle")
	private String pageLifecycle;
    @JsonProperty("page_audience")
	private String pageAudience;
    @JsonProperty("page_category")
	private String pageCategory;
	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	
	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public String getMetaTitle() {
		return metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getPageTopic() {
		return pageTopic;
	}

	public void setPageTopic(String pageTopic) {
		this.pageTopic = pageTopic;
	}

	public String getPageLifecycle() {
		return pageLifecycle;
	}

	public void setPageLifecycle(String pageLifecycle) {
		this.pageLifecycle = pageLifecycle;
	}

	public String getPageAudience() {
		return pageAudience;
	}

	public void setPageAudience(String pageAudience) {
		this.pageAudience = pageAudience;
	}

	public String getPageCategory() {
		return pageCategory;
	}

	public void setPageCategory(String pageCategory) {
		this.pageCategory = pageCategory;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	private String slug;
	private String ext;

	public Glossary() {
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public boolean isDraft() {
		return draft;
	}

	public void setDraft(boolean draft) {
		this.draft = draft;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Glossary [id=" + id + ", title=" + "]";
	}

}
