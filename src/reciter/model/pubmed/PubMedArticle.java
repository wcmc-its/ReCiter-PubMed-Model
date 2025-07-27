package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * The Class PubMedArticleBuilder.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class PubMedArticle {

   
    /** The medlinecitation. */
    private MedlineCitation medlinecitation;
    
    /** The pubmeddata. */
    private PubMedData pubmeddata;
}
