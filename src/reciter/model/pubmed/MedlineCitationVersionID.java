package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationVersionID {

	private String versionID;
	
	public MedlineCitationVersionID() {}
}
