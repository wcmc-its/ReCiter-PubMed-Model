package reciter.model.pubmed;

/**
 * Represents detailed information about a journal article within a Medline citation.
 * This includes publication metadata such as journal, title, abstract, authors, 
 * pagination, electronic location identifiers, publication types, and grant details.
 * @author ved4006
 */
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Builder
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationArticle {

    /** The pubmodel. */
    private String pubmodel;
    
    /** The journal. */
    private MedlineCitationJournal journal;
    
    /** The publication abstract. */
    private MedlineCitationArticleAbstract publicationAbstract;
    
    /** The articletitle. */
    private String articletitle;
    
    /** The pagination. */
    private MedlineCitationArticlePagination pagination;
    
    /** The elocationid. */
    private MedlineCitationArticleELocationID elocationid;
    
    /** The authorlistcompleteyn. */
    private MedlineCitationYNEnum authorlistcompleteyn;
    
    /** The authorlist. */
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationArticleAuthor> authorlist;
    
    /** The grantlistcompleteyn. */
    private MedlineCitationYNEnum grantlistcompleteyn;
    
    /** The publicationtypelist. */
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationPublicationType> publicationtypelist;
    
    /** The articledate. */
    private MedlineCitationDate articledate;
    
    /** The journalinfo. */
    private MedlineCitationJournalInfo journalinfo;
    
    /** The chemicallist. */
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationChemical> chemicallist;
    
    /** The meshheadinglist. */
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationMeshHeading> meshheadinglist;
    
    /** The citationsubset. */
    private MedlineCitationSubset citationsubset;
    
    /** The grantlist. */
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationGrant> grantlist;

}
