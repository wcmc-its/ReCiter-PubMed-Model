package reciter.model.pubmed;

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
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
public class MedlineCitationArticleAbstractText {
    /*enum Label {
        BACKGROUND, OBJECTIVE, METHODS, RESULTS, CONCLUSIONS, UNASSIGNED
    }*/
	private String abstractTextLabel;
	private String abstractTextNlmCategory;
	private String abstractText;
}
