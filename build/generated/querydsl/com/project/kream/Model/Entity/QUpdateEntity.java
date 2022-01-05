package com.project.kream.Model.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUpdateEntity is a Querydsl query type for UpdateEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QUpdateEntity extends EntityPathBase<UpdateEntity> {

    private static final long serialVersionUID = 1716389164L;

    public static final QUpdateEntity updateEntity = new QUpdateEntity("updateEntity");

    public final DateTimePath<java.time.LocalDateTime> ismodified = createDateTime("ismodified", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public QUpdateEntity(String variable) {
        super(UpdateEntity.class, forVariable(variable));
    }

    public QUpdateEntity(Path<? extends UpdateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUpdateEntity(PathMetadata metadata) {
        super(UpdateEntity.class, metadata);
    }

}

