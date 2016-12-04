package reciter.model.pubmed;

public class MedlineCitationPMID {

	private final long pmid;
	private String version;
		
	public MedlineCitationPMID(long pmid) {
		this.pmid = pmid;
	}
	
	public long getPmid() {
		return pmid;
	}
	public String getVersion() {
		return version;
	}
}
