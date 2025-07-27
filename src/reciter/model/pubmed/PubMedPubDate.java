package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;


/**
 * Represents  the date a citation was added to the PubMed database.
 * @author ved4006
 * 
 */

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class PubMedPubDate {
	
	/**
     * The actual publication date (year, month, day) of the article.
     * This is a structured representation from Medline citation metadata.
     */
	private MedlineCitationDate pubMedPubDate;
	
	/** The pub status. */
	private String pubStatus;
}
