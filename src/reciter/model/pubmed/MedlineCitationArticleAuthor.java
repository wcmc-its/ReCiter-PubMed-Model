package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
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
