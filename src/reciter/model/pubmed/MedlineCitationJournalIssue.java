package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationJournalIssue {

	private enum CitedMedium {
		INTERNET,
		PRINT
	}
	
	private CitedMedium citedMedium;
	private String volume;
	private String issue;
	private MedlineCitationDate pubDate;
	
	public MedlineCitationDate getPubDate() {
		return pubDate;
	}
	public void setPubDate(MedlineCitationDate pubDate) {
		this.pubDate = pubDate;
	}
	
	public MedlineCitationJournalIssue() {}
		
}
