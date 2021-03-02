package br.com.dbserver.automacao_api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateUserModel {
    private String name;
    private String job;
}
