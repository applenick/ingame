package rip.bolt.ingame.api.definitions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Series {

  private Integer id;
  private String name;
  private Boolean hideObservers = false;

  public Series() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean getHideObservers() {
    return hideObservers;
  }

  public void setHideObservers(boolean hideObservers) {
    this.hideObservers = hideObservers;
  }

  @Override
  public String toString() {
    return name + " (" + id + "): hideObservers=" + hideObservers;
  }
}
