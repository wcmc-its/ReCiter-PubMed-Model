package reciter.model.pubmed;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * The Class MedlineCitationJournalBuilder.
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationJournal {
	
    /** The Medline Citation Journal ISSN. */
    private List<MedlineCitationJournalISSN> issn;
    
    /** The journalissue. */
    private MedlineCitationJournalIssue journalissue;
    
    /** The title. */
    private String title;
    
    /** The iso abbreviation. */
    private String isoAbbreviation;
}
