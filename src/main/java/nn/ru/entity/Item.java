package nn.ru.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @ManyToOne: Item-Group - прямая
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;
}
