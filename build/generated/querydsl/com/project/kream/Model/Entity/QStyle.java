package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStyle is a Querydsl query type for Style
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStyle extends EntityPathBase<Style> {

    private static final long serialVersionUID = -835425647L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStyle style = new QStyle("style");

    public final QDateEntity _super = new QDateEntity(this);

    public final StringPath content = createString("content");

    public final QCustomer customer;

    public final NumberPath<Long> hit = createNumber("hit", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ProductTag, QProductTag> productTagList = this.<ProductTag, QProductTag>createList("productTagList", ProductTag.class, QProductTag.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final ListPath<StyleHashTag, QStyleHashTag> styleHashTagList = this.<StyleHashTag, QStyleHashTag>createList("styleHashTagList", StyleHashTag.class, QStyleHashTag.class, PathInits.DIRECT2);

    public final ListPath<StyleImg, QStyleImg> styleImgList = this.<StyleImg, QStyleImg>createList("styleImgList", StyleImg.class, QStyleImg.class, PathInits.DIRECT2);

    public final ListPath<StyleLike, QStyleLike> styleLikeList = this.<StyleLike, QStyleLike>createList("styleLikeList", StyleLike.class, QStyleLike.class, PathInits.DIRECT2);

    public final ListPath<StyleReply, QStyleReply> styleReplyList = this.<StyleReply, QStyleReply>createList("styleReplyList", StyleReply.class, QStyleReply.class, PathInits.DIRECT2);

    public QStyle(String variable) {
        this(Style.class, forVariable(variable), INITS);
    }

    public QStyle(Path<? extends Style> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStyle(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStyle(PathMetadata metadata, PathInits inits) {
        this(Style.class, metadata, inits);
    }

    public QStyle(Class<? extends Style> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
    }

}

