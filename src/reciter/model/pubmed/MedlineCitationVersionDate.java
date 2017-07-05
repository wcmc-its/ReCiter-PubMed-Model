package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationVersionDate {
    private String versiondate; // should be a date object, later convert.
}
