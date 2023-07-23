package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationArticleAuthor {

    private MedlineCitationYNEnum validyn;
    private String lastname;
    private String forename;
    private String suffix;
    private String initials;
    private String affiliation;
    private String language;
    private String orcid;
    private String equalContrib;
}
