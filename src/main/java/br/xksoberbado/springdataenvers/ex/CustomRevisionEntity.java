package br.xksoberbado.springdataenvers.ex;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "revinfo")
@RevisionEntity(CustomRevisionListener.class)
@Data
@ToString(callSuper = true)
public class CustomRevisionEntity extends DefaultRevisionEntity {

    private String user;
}
