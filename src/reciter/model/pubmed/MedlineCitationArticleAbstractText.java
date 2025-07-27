package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * The Class MedlineCitationArticleAbstractTextBuilder.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
public class MedlineCitationArticleAbstractText {
	
	/** The abstract text label. */
	private String abstractTextLabel;
	
	/** The abstract text nlm category. */
	private String abstractTextNlmCategory;
	
	/** The abstract text. */
	private String abstractText;
}
