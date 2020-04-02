package com.basumatarau.training.im.ejb.domain.user;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.util.Map;

@NoArgsConstructor
@Data
@Embeddable
public class AuthenticationDetails {

    private String provider;

    private String providedId;

    @EqualsAndHashCode.Exclude
    private String imageUrl;

    @Transient
    @EqualsAndHashCode.Exclude
    private Map<String, Object> attributes;

    @Builder
    public AuthenticationDetails(String authProvider, String providedId, String imageUrl) {
        this.provider = authProvider;
        this.providedId = providedId;
        this.imageUrl = imageUrl;
    }

    @Builder(builderMethodName = "transientBuilder")
    public AuthenticationDetails(String authProvider, String providedId, String imageUrl, Map<String, Object> attributes) {
        this.provider = authProvider;
        this.providedId = providedId;
        this.imageUrl = imageUrl;
        this.attributes = attributes;
    }
}
