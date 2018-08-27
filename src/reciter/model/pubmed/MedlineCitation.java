package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
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
