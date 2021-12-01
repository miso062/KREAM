package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCardInfo is a Querydsl query type for CardInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCardInfo extends EntityPathBase<CardInfo> {

    private static final long serialVersionUID = -836349186L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCardInfo cardInfo = new QCardInfo("cardInfo");

    public final StringPath birthdate = createString("birthdate");

    public final StringPath cardCompany = createString("cardCompany");

    public final EnumPath<com.project.kream.Model.enumclass.CardFlag> cardFlag = createEnum("cardFlag", com.project.kream.Model.enumclass.CardFlag.class);

    public final StringPath cardNumber = createString("cardNumber");

    public final StringPath cardpw = createString("cardpw");

    public final QCustomer customer;

    public final StringPath expiration = createString("expiration");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCardInfo(String variable) {
        this(CardInfo.class, forVariable(variable), INITS);
    }

    public QCardInfo(Path<? extends CardInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCardInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCardInfo(PathMetadata metadata, PathInits inits) {
        this(CardInfo.class, metadata, inits);
    }

    public QCardInfo(Class<? extends CardInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

