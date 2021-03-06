package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationKeywordList {
    private String keywordlistowner;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MedlineCitationKeyword> keywordlist;

    private enum KeywordListOwner {
        NASA,
        PIP,
        KIE,
        NLM,
        NOTNLM,
        HHS
    }
}
