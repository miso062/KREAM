package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStyleLike is a Querydsl query type for StyleLike
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStyleLike extends EntityPathBase<StyleLike> {

    private static final long serialVersionUID = 1913576904L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStyleLike styleLike = new QStyleLike("styleLike");

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QStyle style;

    public QStyleLike(String variable) {
        this(StyleLike.class, forVariable(variable), INITS);
    }

    public QStyleLike(Path<? extends StyleLike> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStyleLike(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStyleLike(PathMetadata metadata, PathInits inits) {
        this(StyleLike.class, metadata, inits);
    }

    public QStyleLike(Class<? extends StyleLike> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.style = inits.isInitialized("style") ? new QStyle(forProperty("style"), inits.get("style")) : null;
    }

}

