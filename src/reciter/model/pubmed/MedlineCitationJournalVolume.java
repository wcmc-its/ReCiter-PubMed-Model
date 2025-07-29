package reciter.model.pubmed;

/**
 * Represents the volume and issue information for a journal in a Medline citation.
 * Typically used to identify the specific edition of a journal in which an article appears.
 * @author ved4006
 */
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationJournalVolume {

    /** The volume. */
    private String volume;
    
    /** The issue. */
    private String issue;
}
