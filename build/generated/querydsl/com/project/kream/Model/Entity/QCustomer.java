package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = -221608194L;

    public static final QCustomer customer = new QCustomer("customer");

    public final QDateEntity _super = new QDateEntity(this);

    public final ListPath<Account, QAccount> accountList = this.<Account, QAccount>createList("accountList", Account.class, QAccount.class, PathInits.DIRECT2);

    public final ListPath<Address, QAddress> addressList = this.<Address, QAddress>createList("addressList", Address.class, QAddress.class, PathInits.DIRECT2);

    public final StringPath agreement = createString("agreement");

    public final ListPath<CardInfo, QCardInfo> cardInfoList = this.<CardInfo, QCardInfo>createList("cardInfoList", CardInfo.class, QCardInfo.class, PathInits.DIRECT2);

    public final ListPath<Cart, QCart> cartList = this.<Cart, QCart>createList("cartList", Cart.class, QCart.class, PathInits.DIRECT2);

    public final ListPath<CustomerQna, QCustomerQna> customerQnaList = this.<CustomerQna, QCustomerQna>createList("customerQnaList", CustomerQna.class, QCustomerQna.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final StringPath emailAllow = createString("emailAllow");

    public final ListPath<Follow, QFollow> followerList = this.<Follow, QFollow>createList("followerList", Follow.class, QFollow.class, PathInits.DIRECT2);

    public final ListPath<Follow, QFollow> followingList = this.<Follow, QFollow>createList("followingList", Follow.class, QFollow.class, PathInits.DIRECT2);

    public final StringPath hp = createString("hp");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath image = createString("image");

    public final StringPath message = createString("message");

    public final NumberPath<Long> point = createNumber("point", Long.class);

    public final StringPath privacyPolicy = createString("privacyPolicy");

    public final ListPath<ProductQna, QProductQna> productQnaList = this.<ProductQna, QProductQna>createList("productQnaList", ProductQna.class, QProductQna.class, PathInits.DIRECT2);

    public final ListPath<Purchase, QPurchase> purchaseList = this.<Purchase, QPurchase>createList("purchaseList", Purchase.class, QPurchase.class, PathInits.DIRECT2);

    public final EnumPath<com.project.kream.Model.enumclass.CustomerRank> rank = createEnum("rank", com.project.kream.Model.enumclass.CustomerRank.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public final ListPath<ReplyLike, QReplyLike> replyLikeList = this.<ReplyLike, QReplyLike>createList("replyLikeList", ReplyLike.class, QReplyLike.class, PathInits.DIRECT2);

    public final EnumPath<com.project.kream.Model.enumclass.CustomerRole> role = createEnum("role", com.project.kream.Model.enumclass.CustomerRole.class);

    public final ListPath<Sales, QSales> salesList = this.<Sales, QSales>createList("salesList", Sales.class, QSales.class, PathInits.DIRECT2);

    public final StringPath shoesize = createString("shoesize");

    public final StringPath smsAllow = createString("smsAllow");

    public final ListPath<StyleCustomer, QStyleCustomer> styleCustomerList = this.<StyleCustomer, QStyleCustomer>createList("styleCustomerList", StyleCustomer.class, QStyleCustomer.class, PathInits.DIRECT2);

    public final ListPath<StyleLike, QStyleLike> styleLikeList = this.<StyleLike, QStyleLike>createList("styleLikeList", StyleLike.class, QStyleLike.class, PathInits.DIRECT2);

    public final ListPath<Style, QStyle> styleList = this.<Style, QStyle>createList("styleList", Style.class, QStyle.class, PathInits.DIRECT2);

    public final EnumPath<com.project.kream.Model.enumclass.CustomerType> type = createEnum("type", com.project.kream.Model.enumclass.CustomerType.class);

    public final StringPath userid = createString("userid");

    public final StringPath userpw = createString("userpw");

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata metadata) {
        super(Customer.class, metadata);
    }

}

