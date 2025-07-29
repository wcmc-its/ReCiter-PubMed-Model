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
 * Represents the complete publication date history for a PubMed article.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class History {
	
	/** A list of {@link PubMedPubDate} entries representing various types of publication dates. */
	private List<PubMedPubDate> pubmedPubDate;
}
