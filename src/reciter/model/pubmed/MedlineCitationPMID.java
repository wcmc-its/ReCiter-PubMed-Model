package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationPMID {

	private long pmid;
	private String version;
	
	public MedlineCitationPMID() {}
	
	public MedlineCitationPMID(long pmid) {
		this.pmid = pmid;
	}
	
	public long getPmid() {
		return pmid;
	}
	public String getVersion() {
		return version;
	}
	public void setPmid(long pmid) {
		this.pmid = pmid;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
