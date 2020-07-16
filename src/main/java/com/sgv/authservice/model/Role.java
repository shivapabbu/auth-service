package com.sgv.authservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection="roles")
public class Role {

    @Id
    private String id;
    @NonNull
    private SGVRole name;


   /* public Role() {

    }

    public Role(SGVRole name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SGVRole getName() {
        return name;
    }

    public void setName(SGVRole name) {
        this.name = name;
    }
*/
}
