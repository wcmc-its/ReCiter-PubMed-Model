package reciter.model.pubmed;

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

    private String pubmodel;
    private MedlineCitationJournal journal;
    private MedlineCitationArticleAbstract publicationAbstract;
    private String articletitle;
    private MedlineCitationArticlePagination pagination;
    private MedlineCitationArticleELocationID elocationid;
    private MedlineCitationYNEnum authorlistcompleteyn;
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationArticleAuthor> authorlist;
    private MedlineCitationYNEnum grantlistcompleteyn;
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationPublicationType> publicationtypelist;
    private MedlineCitationDate articledate;
    private MedlineCitationJournalInfo journalinfo;
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationChemical> chemicallist;
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationMeshHeading> meshheadinglist;
    private MedlineCitationSubset citationsubset;
    @JsonInclude(Include.NON_EMPTY)
    private List<MedlineCitationGrant> grantlist;

    private enum PubModel {
        PRINT,
        PRINT_ELECTRONIC,
        ELECTRONIC,
        ELECTRONIC_PRINT,
        ELECTRONIC_ECOLLECTION
    }
}
