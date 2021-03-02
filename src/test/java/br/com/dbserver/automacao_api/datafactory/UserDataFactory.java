package br.com.dbserver.automacao_api.datafactory;

import br.com.dbserver.automacao_api.models.CreateUserModel;

public class UserDataFactory {
    public static CreateUserModel create() {
        return CreateUserModel.builder()
                .name("morpheus")
                .job("leader")
                .build();
    }
}