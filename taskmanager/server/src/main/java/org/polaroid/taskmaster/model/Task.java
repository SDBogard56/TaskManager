package org.polaroid.taskmaster.model;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private @NonNull String name;
    private String description;
    @ManyToMany(mappedBy = "tasks", fetch = FetchType.EAGER)
    private Set<Project> projects;
}

