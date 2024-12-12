package org.example.hhjava245springdata.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
public record User(String id, String name, int age) {
}
