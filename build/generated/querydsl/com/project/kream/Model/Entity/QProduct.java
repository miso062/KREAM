package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = 1880580559L;

    public static final QProduct product = new QProduct("product");

    public final QDateEntity _super = new QDateEntity(this);

    public final StringPath brand = createString("brand");

    public final EnumPath<com.project.kream.Model.enumclass.Category> category = createEnum("category", com.project.kream.Model.enumclass.Category.class);

    public final StringPath collection = createString("collection");

    public final StringPath color = createString("color");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath korName = createString("korName");

    public final StringPath modelNumber = createString("modelNumber");

    public final StringPath name = createString("name");

    public final EnumPath<com.project.kream.Model.enumclass.PostStatus> postStatus = createEnum("postStatus", com.project.kream.Model.enumclass.PostStatus.class);

    public final ListPath<ProImg, QProImg> proImgList = this.<ProImg, QProImg>createList("proImgList", ProImg.class, QProImg.class, PathInits.DIRECT2);

    public final ListPath<ProSize, QProSize> proSizeList = this.<ProSize, QProSize>createList("proSizeList", ProSize.class, QProSize.class, PathInits.DIRECT2);

    public final ListPath<Purchase, QPurchase> purchaseList = this.<Purchase, QPurchase>createList("purchaseList", Purchase.class, QPurchase.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final StringPath release = createString("release");

    public final NumberPath<Long> releasePrice = createNumber("releasePrice", Long.class);

    public final ListPath<Sales, QSales> salesList = this.<Sales, QSales>createList("salesList", Sales.class, QSales.class, PathInits.DIRECT2);

    public final EnumPath<com.project.kream.Model.enumclass.SubCategory> subCategory = createEnum("subCategory", com.project.kream.Model.enumclass.SubCategory.class);

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

