package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductQna is a Querydsl query type for ProductQna
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProductQna extends EntityPathBase<ProductQna> {

    private static final long serialVersionUID = 822105493L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductQna productQna = new QProductQna("productQna");

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

    public final EnumPath<com.project.kream.Model.enumclass.ProductQnaType> type = createEnum("type", com.project.kream.Model.enumclass.ProductQnaType.class);

    public QProductQna(String variable) {
        this(ProductQna.class, forVariable(variable), INITS);
    }

    public QProductQna(Path<? extends ProductQna> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductQna(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductQna(PathMetadata metadata, PathInits inits) {
        this(ProductQna.class, metadata, inits);
    }

    public QProductQna(Class<? extends ProductQna> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

