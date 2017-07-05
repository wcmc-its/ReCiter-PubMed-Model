package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationCommentsCorrections {

    private String reftype;
    private String refsource;
    private String pmidversion;
    private String pmid;
}
