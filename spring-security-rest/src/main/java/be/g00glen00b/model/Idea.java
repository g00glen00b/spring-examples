package be.g00glen00b.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Idea {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @Column
  private String title;
  
  @Column
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
