package reciter.model.pubmed;

/**
 * Represents the abstract section of a Medline journal article,
 * including the abstract text(s) and any associated copyright information.
 * @author ved4006
 */
import java.util.List;

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
public class MedlineCitationArticleAbstract {
	
    /** The abstract texts. */
    private List<MedlineCitationArticleAbstractText> abstractTexts;
    
    /** The copyright information. */
    private String copyrightInformation;
}
