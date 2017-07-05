package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationArticleAbstractText {
    enum Label {
        BACKGROUND, OBJECTIVE, METHODS, RESULTS, CONCLUSIONS, UNASSIGNED
    }
}
