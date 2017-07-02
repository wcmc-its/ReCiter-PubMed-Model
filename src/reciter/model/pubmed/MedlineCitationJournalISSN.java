package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationJournalISSN {

	private enum IssnType {
		ELECTRONIC,
		PRINT,
		UNDETERMINED
	}
	
	private IssnType issnType;
	private String issn;
	
	public MedlineCitationJournalISSN() {}
}
