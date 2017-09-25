package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
public class MedlineCitationKeywordList {
    private KeywordListOwner keywordlistowner;
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
