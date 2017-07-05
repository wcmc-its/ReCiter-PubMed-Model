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
public class MedlineCitation {

    private MedlineCitationPMID medlinecitationpmid;
    private MedlineCitationOwner medlinecitationowner;
    private MedlineCitationStatus medlinecitationstatus;
    private MedlineCitationVersionDate medlinecitationversiondate;
    private MedlineCitationVersionID medlinecitationversionid;
    private MedlineCitationDate datecreated;
    private MedlineCitationDate datecompleted;
    private MedlineCitationDate daterevised;
    private MedlineCitationArticle article;
    private List<MedlineCitationMeshHeading> meshheadinglist;
    private MedlineCitationKeywordList keywordlist;
    private List<MedlineCitationCommentsCorrections> commentscorrectionslist;

    private enum MedlineCitationOwner {
        NLM,
        NASA,
        PIP,
        KIE,
        HSR,
        HMD,
        SIS,
        NOTNLM
    }

    private enum MedlineCitationStatus {
        COMPLETED,
        IN_PROCESS,
        PUBMED_NOT_MEDLINE,
        IN_DATA_REVIEW,
        PUBLISHER,
        MEDLINE,
        OLDMEDLINE
    }
}
