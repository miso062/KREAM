package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWithdrawal is a Querydsl query type for Withdrawal
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWithdrawal extends EntityPathBase<Withdrawal> {

    private static final long serialVersionUID = 1734491093L;

    public static final QWithdrawal withdrawal = new QWithdrawal("withdrawal");

    public final QDateEntity _super = new QDateEntity(this);

    public final StringPath email = createString("email");

    public final StringPath hp = createString("hp");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regdate = _super.regdate;

    public QWithdrawal(String variable) {
        super(Withdrawal.class, forVariable(variable));
    }

    public QWithdrawal(Path<? extends Withdrawal> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWithdrawal(PathMetadata metadata) {
        super(Withdrawal.class, metadata);
    }

}

