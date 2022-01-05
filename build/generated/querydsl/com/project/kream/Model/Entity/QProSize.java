package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProSize is a Querydsl query type for ProSize
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProSize extends EntityPathBase<ProSize> {

    private static final long serialVersionUID = 1880063278L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProSize proSize = new QProSize("proSize");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QProduct product;

    public final StringPath sizeType = createString("sizeType");

    public QProSize(String variable) {
        this(ProSize.class, forVariable(variable), INITS);
    }

    public QProSize(Path<? extends ProSize> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProSize(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProSize(PathMetadata metadata, PathInits inits) {
        this(ProSize.class, metadata, inits);
    }

    public QProSize(Class<? extends ProSize> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
    }

}

