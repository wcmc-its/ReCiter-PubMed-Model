package reciter.model.pubmed;

/**
 * Represents an  author of a Medline journal article, including their name,
 * affiliation, ORCID identifier, and other relevant metadata.
 * @author ved4006
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationArticleAuthor {

    /** The validyn. */
    private MedlineCitationYNEnum validyn;
    
    /** The lastname. */
    private String lastname;
    
    /** The forename. */
    private String forename;
    
    /** The suffix. */
    private String suffix;
    
    /** The initials. */
    private String initials;
    
    /** The affiliation. */
    private String affiliation;
    
    /** The language. */
    private String language;
    
    /** The orcid. */
    private String orcid;
    
    /** The equal contrib. */
    private String equalContrib;
}
