package reciter.model.pubmed;
/**
 * Represents a Medline citation record, containing details such as PMID,
 * ownership, status, versioning, dates, article information, MeSH headings,
 * keywords, comments/corrections, and COI statement.
 * @author ved4006
 */
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

	/** The PubMed identifier for the citation. */
    private MedlineCitationPMID medlinecitationpmid;

    /** The owner of the citation record (e.g., NLM). */
    private String medlinecitationowner;

    /** The status of the citation record (e.g., MEDLINE, Publisher). */
    private String medlinecitationstatus;

    /** The version date of the citation record. */
    private MedlineCitationVersionDate medlinecitationversiondate;

    /** The version ID of the citation record. */
    private MedlineCitationVersionID medlinecitationversionid;

    /** The date the citation was created. */
    private MedlineCitationDate datecreated;

    /** The date the citation was completed. */
    private MedlineCitationDate datecompleted;

    /** The date the citation was last revised. */
    private MedlineCitationDate daterevised;

    /** The article details associated with the citation. */
    private MedlineCitationArticle article;

    /**
     * The list of MeSH (Medical Subject Headings) headings associated with the citation.
     * Included only if non-empty.
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MedlineCitationMeshHeading> meshheadinglist;

    /** The list of keywords associated with the citation. */
    private MedlineCitationKeywordList keywordlist;

    /**
     * The list of comments and corrections associated with the citation.
     * Included only if non-empty.
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MedlineCitationCommentsCorrections> commentscorrectionslist;

    /** The Conflict of Interest (COI) statement for the article, if present. */
    private String coiStatement;
}
