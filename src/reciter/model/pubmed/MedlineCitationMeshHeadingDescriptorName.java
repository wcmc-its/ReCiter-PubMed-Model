package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationMeshHeadingDescriptorName {

    private MedlineCitationYNEnum majortopicyn;
    private String descriptorname;
    private String descriptornameui;
}
