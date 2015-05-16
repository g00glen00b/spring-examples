package be.g00glen00b.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table
public class Idea {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column
  @NotNull(message = "error.title.notnull")
  @Size(min = 1, max = 30, message = "error.title.size")
  private String title;
  @Column
  @Size(max = 100, message = "error.description.size")
  private String description;
  @Column
  private Date createdAt;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public long getId() {
    return id;
  }
}
