package entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseAuditableEntity extends BaseTimeEntity {

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "deleted_by")
    protected String deletedBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }
}
