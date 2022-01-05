package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStyleHashTag is a Querydsl query type for StyleHashTag
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStyleHashTag extends EntityPathBase<StyleHashTag> {

    private static final long serialVersionUID = 792107995L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStyleHashTag styleHashTag = new QStyleHashTag("styleHashTag");

    public final QHashTag hashTag;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QStyle style;

    public QStyleHashTag(String variable) {
        this(StyleHashTag.class, forVariable(variable), INITS);
    }

    public QStyleHashTag(Path<? extends StyleHashTag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStyleHashTag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStyleHashTag(PathMetadata metadata, PathInits inits) {
        this(StyleHashTag.class, metadata, inits);
    }

    public QStyleHashTag(Class<? extends StyleHashTag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hashTag = inits.isInitialized("hashTag") ? new QHashTag(forProperty("hashTag")) : null;
        this.style = inits.isInitialized("style") ? new QStyle(forProperty("style"), inits.get("style")) : null;
    }

}

