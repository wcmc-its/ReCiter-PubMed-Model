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
public class MedlineCitation {

    private MedlineCitationPMID medlinecitationpmid;
    private String medlinecitationowner;
    private String medlinecitationstatus;
    private MedlineCitationVersionDate medlinecitationversiondate;
    private MedlineCitationVersionID medlinecitationversionid;
    private MedlineCitationDate datecreated;
    private MedlineCitationDate datecompleted;
    private MedlineCitationDate daterevised;
    private MedlineCitationArticle article;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MedlineCitationMeshHeading> meshheadinglist;
    private MedlineCitationKeywordList keywordlist;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MedlineCitationCommentsCorrections> commentscorrectionslist;
    private String coiStatement;

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
