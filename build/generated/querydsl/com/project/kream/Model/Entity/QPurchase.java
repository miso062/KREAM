package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPurchase is a Querydsl query type for Purchase
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPurchase extends EntityPathBase<Purchase> {

    private static final long serialVersionUID = 915541025L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPurchase purchase = new QPurchase("purchase");

    public final QDateEntity _super = new QDateEntity(this);

    public final QAddress address;

    public final QCardInfo cardInfo;

    public final QCustomer customer;

    public final QDelivery delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> period = createNumber("period", Long.class);

    public final NumberPath<Long> price = createNumber("price", Long.class);

    public final QProduct product;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final QSales sales;

    public final StringPath sizeType = createString("sizeType");

    public final EnumPath<com.project.kream.Model.enumclass.PurchaseStatus1> status1 = createEnum("status1", com.project.kream.Model.enumclass.PurchaseStatus1.class);

    public final EnumPath<com.project.kream.Model.enumclass.PurchaseStatus2> status2 = createEnum("status2", com.project.kream.Model.enumclass.PurchaseStatus2.class);

    public final EnumPath<com.project.kream.Model.enumclass.PurchaseStatus3> status3 = createEnum("status3", com.project.kream.Model.enumclass.PurchaseStatus3.class);

    public QPurchase(String variable) {
        this(Purchase.class, forVariable(variable), INITS);
    }

    public QPurchase(Path<? extends Purchase> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPurchase(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPurchase(PathMetadata metadata, PathInits inits) {
        this(Purchase.class, metadata, inits);
    }

    public QPurchase(Class<? extends Purchase> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address"), inits.get("address")) : null;
        this.cardInfo = inits.isInitialized("cardInfo") ? new QCardInfo(forProperty("cardInfo"), inits.get("cardInfo")) : null;
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.delivery = inits.isInitialized("delivery") ? new QDelivery(forProperty("delivery"), inits.get("delivery")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
        this.sales = inits.isInitialized("sales") ? new QSales(forProperty("sales"), inits.get("sales")) : null;
    }

}

