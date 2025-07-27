package reciter.model.pubmed;

/**
 * Represents an electronic location identifier (eLocationID) for a Medline journal article,
 * such as a DOI (Digital Object Identifier) or PII (Publisher Item Identifier).
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
public class MedlineCitationArticleELocationID {

    /** The eidtype. */
    private String eidtype;
    
    /** The validyn. */
    private MedlineCitationYNEnum validyn;
    
    /** The elocationid. */
    private String elocationid;

    /**
     * The Enum EIdType.
     */
    private enum EIdType {
        
        /** The doi. */
        DOI,
        
        /** The pii. */
        PII
    }
}
