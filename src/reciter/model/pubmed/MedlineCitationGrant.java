package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationGrant {

    private String grantid;
    private String acronym;
    private String agency;
    private String country;
}
