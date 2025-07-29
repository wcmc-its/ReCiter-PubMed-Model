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

/**
 * The Class MedlineCitationArticlePaginationBuilder.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(Include.NON_EMPTY)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationArticlePagination {
    
    /** The medlinepgns. */
    private List<String> medlinepgns;
}
