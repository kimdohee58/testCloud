package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWishEntity is a Querydsl query type for WishEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWishEntity extends EntityPathBase<WishEntity> {

    private static final long serialVersionUID = -1305689857L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWishEntity wishEntity = new QWishEntity("wishEntity");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final QDormEntity dorm;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUsersEntity user;

    public QWishEntity(String variable) {
        this(WishEntity.class, forVariable(variable), INITS);
    }

    public QWishEntity(Path<? extends WishEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWishEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWishEntity(PathMetadata metadata, PathInits inits) {
        this(WishEntity.class, metadata, inits);
    }

    public QWishEntity(Class<? extends WishEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dorm = inits.isInitialized("dorm") ? new QDormEntity(forProperty("dorm"), inits.get("dorm")) : null;
        this.user = inits.isInitialized("user") ? new QUsersEntity(forProperty("user")) : null;
    }

}

