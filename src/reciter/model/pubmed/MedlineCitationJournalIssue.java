package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * Represents a Journal Issue from a MEDLINE citation.
 * @author ved4006
 */

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationJournalIssue {

    private String citedmedium;
    /**
     * The journal volume in which the article appears.
     */
    private String volume;
    /**
     * The issue .
     */
    private String issue;
    
    /**
     * Medline Citation  date 
     */
    private MedlineCitationDate pubdate;
    
    /** The medline date. */
    private String medlineDate;

}
