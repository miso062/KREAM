package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStyleReply is a Querydsl query type for StyleReply
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStyleReply extends EntityPathBase<StyleReply> {

    private static final long serialVersionUID = -803231015L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStyleReply styleReply = new QStyleReply("styleReply");

    public final QDateEntity _super = new QDateEntity(this);

    public final StringPath content = createString("content");

    public final QCustomer customer;

    public final NumberPath<Long> depth = createNumber("depth", Long.class);

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    public final NumberPath<Long> groupNum = createNumber("groupNum", Long.class);

    public final NumberPath<Long> hit = createNumber("hit", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final ListPath<ReplyHashTag, QReplyHashTag> replyHashTagList = this.<ReplyHashTag, QReplyHashTag>createList("replyHashTagList", ReplyHashTag.class, QReplyHashTag.class, PathInits.DIRECT2);

    public final ListPath<ReplyLike, QReplyLike> replyLikeList = this.<ReplyLike, QReplyLike>createList("replyLikeList", ReplyLike.class, QReplyLike.class, PathInits.DIRECT2);

    public final QStyle style;

    public QStyleReply(String variable) {
        this(StyleReply.class, forVariable(variable), INITS);
    }

    public QStyleReply(Path<? extends StyleReply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStyleReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStyleReply(PathMetadata metadata, PathInits inits) {
        this(StyleReply.class, metadata, inits);
    }

    public QStyleReply(Class<? extends StyleReply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.style = inits.isInitialized("style") ? new QStyle(forProperty("style"), inits.get("style")) : null;
    }

}

