package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationVersionDate {

	private String versionDate; // should be a date object, later convert.
	
	public MedlineCitationVersionDate() {}
}
