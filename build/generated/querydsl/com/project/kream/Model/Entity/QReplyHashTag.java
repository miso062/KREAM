package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReplyHashTag is a Querydsl query type for ReplyHashTag
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReplyHashTag extends EntityPathBase<ReplyHashTag> {

    private static final long serialVersionUID = -182385534L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReplyHashTag replyHashTag = new QReplyHashTag("replyHashTag");

    public final QHashTag hashTag;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QStyleReply styleReply;

    public QReplyHashTag(String variable) {
        this(ReplyHashTag.class, forVariable(variable), INITS);
    }

    public QReplyHashTag(Path<? extends ReplyHashTag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReplyHashTag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReplyHashTag(PathMetadata metadata, PathInits inits) {
        this(ReplyHashTag.class, metadata, inits);
    }

    public QReplyHashTag(Class<? extends ReplyHashTag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hashTag = inits.isInitialized("hashTag") ? new QHashTag(forProperty("hashTag")) : null;
        this.styleReply = inits.isInitialized("styleReply") ? new QStyleReply(forProperty("styleReply"), inits.get("styleReply")) : null;
    }

}

