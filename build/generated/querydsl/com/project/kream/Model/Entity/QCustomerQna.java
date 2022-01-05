package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomerQna is a Querydsl query type for CustomerQna
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerQna extends EntityPathBase<CustomerQna> {

    private static final long serialVersionUID = -564892154L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerQna customerQna = new QCustomerQna("customerQna");

    public final QUpdateEntity _super = new QUpdateEntity(this);

    public final StringPath acomment = createString("acomment");

    public final StringPath answer = createString("answer");

    public final StringPath content = createString("content");

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> ismodified = _super.ismodified;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final EnumPath<com.project.kream.Model.enumclass.QnaStauts> status = createEnum("status", com.project.kream.Model.enumclass.QnaStauts.class);

    public final StringPath title = createString("title");

    public final EnumPath<com.project.kream.Model.enumclass.CustomerQnaType> type = createEnum("type", com.project.kream.Model.enumclass.CustomerQnaType.class);

    public QCustomerQna(String variable) {
        this(CustomerQna.class, forVariable(variable), INITS);
    }

    public QCustomerQna(Path<? extends CustomerQna> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomerQna(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomerQna(PathMetadata metadata, PathInits inits) {
        this(CustomerQna.class, metadata, inits);
    }

    public QCustomerQna(Class<? extends CustomerQna> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
    }

}

