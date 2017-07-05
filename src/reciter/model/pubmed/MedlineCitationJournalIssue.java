package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationJournalIssue {

    private CitedMedium citedmedium;
    private String volume;
    private String issue;
    private MedlineCitationDate pubdate;
    private enum CitedMedium {
        INTERNET,
        PRINT
    }
}
