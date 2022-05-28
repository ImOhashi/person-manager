package com.ohashi.personmanager.entities;

import com.ohashi.personmanager.enums.ClientType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Generated
@Validated
@NoArgsConstructor
@AllArgsConstructor
@Document("Client")
public class Client implements Serializable {

    @Id
    private ObjectId _id;

    @NotNull
    @NotEmpty
    private ClientType type;

    @NotNull
    private Person person;

    @NotNull
    @NotEmpty
    private Double money;
}
