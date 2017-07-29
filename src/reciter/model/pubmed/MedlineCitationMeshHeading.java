package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedlineCitationMeshHeading {
    private MedlineCitationMeshHeadingDescriptorName descriptorname;
    private List<MedlineCitationMeshHeadingQualifierName> qualifiernamelist;
}