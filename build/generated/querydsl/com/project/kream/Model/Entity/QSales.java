package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSales is a Querydsl query type for Sales
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSales extends EntityPathBase<Sales> {

    private static final long serialVersionUID = -836004372L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSales sales = new QSales("sales");

    public final QDateEntity _super = new QDateEntity(this);

    public final QAccount account;

    public final QAddress address;

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> period = createNumber("period", Long.class);

    public final NumberPath<Long> price = createNumber("price", Long.class);

    public final QProduct product;

    public final QPurchase purchase;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final StringPath sizeType = createString("sizeType");

    public final EnumPath<com.project.kream.Model.enumclass.SalesStatus1> status1 = createEnum("status1", com.project.kream.Model.enumclass.SalesStatus1.class);

    public final EnumPath<com.project.kream.Model.enumclass.SalesStatus2> status2 = createEnum("status2", com.project.kream.Model.enumclass.SalesStatus2.class);

    public final EnumPath<com.project.kream.Model.enumclass.SalesStatus3> status3 = createEnum("status3", com.project.kream.Model.enumclass.SalesStatus3.class);

    public QSales(String variable) {
        this(Sales.class, forVariable(variable), INITS);
    }

    public QSales(Path<? extends Sales> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSales(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSales(PathMetadata metadata, PathInits inits) {
        this(Sales.class, metadata, inits);
    }

    public QSales(Class<? extends Sales> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.account = inits.isInitialized("account") ? new QAccount(forProperty("account"), inits.get("account")) : null;
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address"), inits.get("address")) : null;
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
        this.purchase = inits.isInitialized("purchase") ? new QPurchase(forProperty("purchase"), inits.get("purchase")) : null;
    }

}

