package org.bogard.taskmanager.model;

import lombok.*;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "task")
    Set<ProjectTask> projectTask;
}

