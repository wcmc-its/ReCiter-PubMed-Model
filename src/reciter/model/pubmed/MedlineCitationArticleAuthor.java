package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationArticleAuthor {

    private MedlineCitationYNEnum validyn;
    private String lastname;
    private String forename;
    private String suffix;
    private String initials;
    private String affiliation;
    private String language;
}
