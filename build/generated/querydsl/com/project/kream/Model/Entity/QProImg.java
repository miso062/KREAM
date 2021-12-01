package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProImg is a Querydsl query type for ProImg
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProImg extends EntityPathBase<ProImg> {

    private static final long serialVersionUID = -216456970L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProImg proImg = new QProImg("proImg");

    public final StringPath filePath = createString("filePath");

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath origFileName = createString("origFileName");

    public final QProduct product;

    public QProImg(String variable) {
        this(ProImg.class, forVariable(variable), INITS);
    }

    public QProImg(Path<? extends ProImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProImg(PathMetadata metadata, PathInits inits) {
        this(ProImg.class, metadata, inits);
    }

    public QProImg(Class<? extends ProImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
    }

}

