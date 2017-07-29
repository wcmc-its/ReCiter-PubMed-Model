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
public class MedlineCitationArticle {

    private PubModel pubmodel;
    private MedlineCitationJournal journal;
    private String articletitle;
    private MedlineCitationArticlePagination pagination;
    private MedlineCitationArticleELocationID elocationid;
    private MedlineCitationYNEnum authorlistcompleteyn;
    private List<MedlineCitationArticleAuthor> authorlist;
    private MedlineCitationYNEnum grantlistcompleteyn;
    private List<MedlineCitationPublicationType> publicationtypelist;
    private MedlineCitationDate articledate;
    private MedlineCitationJournalInfo journalinfo;
    private List<MedlineCitationChemical> chemicallist;
    private List<MedlineCitationMeshHeading> meshheadinglist;
    private MedlineCitationSubset citationsubset;
    private List<MedlineCitationGrant> grantlist;

    private enum PubModel {
        PRINT,
        PRINT_ELECTRONIC,
        ELECTRONIC,
        ELECTRONIC_PRINT,
        ELECTRONIC_ECOLLECTION
    }
}
