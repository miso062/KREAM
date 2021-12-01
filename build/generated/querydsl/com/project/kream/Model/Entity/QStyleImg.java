package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStyleImg is a Querydsl query type for StyleImg
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStyleImg extends EntityPathBase<StyleImg> {

    private static final long serialVersionUID = 1170104178L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStyleImg styleImg = new QStyleImg("styleImg");

    public final StringPath filePath = createString("filePath");

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath origFileName = createString("origFileName");

    public final QStyle style;

    public QStyleImg(String variable) {
        this(StyleImg.class, forVariable(variable), INITS);
    }

    public QStyleImg(Path<? extends StyleImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStyleImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStyleImg(PathMetadata metadata, PathInits inits) {
        this(StyleImg.class, metadata, inits);
    }

    public QStyleImg(Class<? extends StyleImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.style = inits.isInitialized("style") ? new QStyle(forProperty("style"), inits.get("style")) : null;
    }

}

