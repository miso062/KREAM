package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStyleCustomer is a Querydsl query type for StyleCustomer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStyleCustomer extends EntityPathBase<StyleCustomer> {

    private static final long serialVersionUID = -756470385L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStyleCustomer styleCustomer = new QStyleCustomer("styleCustomer");

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath intro = createString("intro");

    public final StringPath name = createString("name");

    public final StringPath profileName = createString("profileName");

    public QStyleCustomer(String variable) {
        this(StyleCustomer.class, forVariable(variable), INITS);
    }

    public QStyleCustomer(Path<? extends StyleCustomer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStyleCustomer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStyleCustomer(PathMetadata metadata, PathInits inits) {
        this(StyleCustomer.class, metadata, inits);
    }

    public QStyleCustomer(Class<? extends StyleCustomer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

