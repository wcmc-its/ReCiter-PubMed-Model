package reciter.model.pubmed;

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
