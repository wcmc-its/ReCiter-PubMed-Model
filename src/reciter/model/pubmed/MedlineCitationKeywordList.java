package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
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
