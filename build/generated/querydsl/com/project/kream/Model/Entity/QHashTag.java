package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHashTag is a Querydsl query type for HashTag
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHashTag extends EntityPathBase<HashTag> {

    private static final long serialVersionUID = -1407395700L;

    public static final QHashTag hashTag = new QHashTag("hashTag");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ReplyHashTag, QReplyHashTag> replyHashTagList = this.<ReplyHashTag, QReplyHashTag>createList("replyHashTagList", ReplyHashTag.class, QReplyHashTag.class, PathInits.DIRECT2);

    public final ListPath<StyleHashTag, QStyleHashTag> styleHashTagList = this.<StyleHashTag, QStyleHashTag>createList("styleHashTagList", StyleHashTag.class, QStyleHashTag.class, PathInits.DIRECT2);

    public final StringPath tagName = createString("tagName");

    public QHashTag(String variable) {
        super(HashTag.class, forVariable(variable));
    }

    public QHashTag(Path<? extends HashTag> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHashTag(PathMetadata metadata) {
        super(HashTag.class, metadata);
    }

}

