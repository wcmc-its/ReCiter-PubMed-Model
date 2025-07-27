package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * The Class MedlineCitationCommentsCorrectionsBuilder.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationCommentsCorrections {

    /** The reftype. */
    private String reftype;
    
    /** The refsource. */
    private String refsource;
    
    /** The pmidversion. */
    private String pmidversion;
    
    /** The pmid. */
    private String pmid;
}
