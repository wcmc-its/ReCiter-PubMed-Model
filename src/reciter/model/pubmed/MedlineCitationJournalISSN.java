package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * Represents the ISSN (International Standard Serial Number) element of a journal
 * in a MEDLINE citation, including the type of ISSN (print, electronic, etc.).
 * @author ved4006
 */
@Builder
@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationJournalISSN {

	 /**
     * Type of ISSN eg:("Electronic", "Print", "Linking").
     */
    private String issntype;
    
    /** The ISSN value. */
    private String issn;
    
    /**
     * Enumeration of valid ISSN types used in PubMed metadata.
     */
    public enum IssnType {
        
        /** The electronic. */
        ELECTRONIC,
        
        /** The print. */
        PRINT,
        
        /** The undetermined. */
        UNDETERMINED,
        
        /** The linking. */
        LINKING
    }
}
