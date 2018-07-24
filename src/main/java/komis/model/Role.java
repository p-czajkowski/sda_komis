package komis.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role extends BaseModel {

    private String roleType;

}
