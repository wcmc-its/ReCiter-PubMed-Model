package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;


/**
 * Represents the PubmedData section of a PubMed article XML.
 * @author ved4006
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
public class PubMedData {
	
	/**
     * Contains the publication history of the article.
     */
	private History history;
	
	/**
    * The publication status .
    */
	private String publicationStatus;
	
    /** The article id list.
    *
    */
    private ArticleIdList articleIdList;
    
}
