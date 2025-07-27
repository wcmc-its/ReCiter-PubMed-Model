package reciter.model.pubmed;

/**
 * Represents a funding grant acknowledged in a Medline journal article.
 * Includes the grant identifier, associated agency, and other funding details.
 * @author ved4006
 */

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
public class MedlineCitationGrant {

	/** The unique identifier for the grant. */
    private String grantid;
    
    /** The acronym. */
    private String acronym;
    
    /** The agency. */
    private String agency;
    /** The country where the funding agency is based. */
    private String country;
}
