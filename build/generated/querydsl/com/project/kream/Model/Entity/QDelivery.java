package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDelivery is a Querydsl query type for Delivery
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDelivery extends EntityPathBase<Delivery> {

    private static final long serialVersionUID = -4316396L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDelivery delivery = new QDelivery("delivery");

    public final QDateEntity _super = new QDateEntity(this);

    public final EnumPath<com.project.kream.Model.enumclass.DeliveryStatus> deliveryStatus = createEnum("deliveryStatus", com.project.kream.Model.enumclass.DeliveryStatus.class);

    public final StringPath devCompany = createString("devCompany");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPurchase purchase;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final NumberPath<Long> trackNum = createNumber("trackNum", Long.class);

    public QDelivery(String variable) {
        this(Delivery.class, forVariable(variable), INITS);
    }

    public QDelivery(Path<? extends Delivery> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDelivery(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDelivery(PathMetadata metadata, PathInits inits) {
        this(Delivery.class, metadata, inits);
    }

    public QDelivery(Class<? extends Delivery> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.purchase = inits.isInitialized("purchase") ? new QPurchase(forProperty("purchase"), inits.get("purchase")) : null;
    }

}

