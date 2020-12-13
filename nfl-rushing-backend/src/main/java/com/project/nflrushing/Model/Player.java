package com.project.nflrushing.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {

  @JsonProperty("Player")
  private String player;

  @JsonProperty("Team")
  private String team;

  @JsonProperty("Pos")
  private String pos;

  @JsonProperty("Att")
  private Integer att;

  @JsonProperty("Att/G")
  private Double attPerG;

  @JsonProperty("Yds")
  private Double yds;

  @JsonProperty("Avg")
  private Double avg;

  @JsonProperty("Yds/G")
  private Double ydsPerG;

  @JsonProperty("TD")
  private Integer td;

  @JsonProperty("Lng")
  private String lng;

  @JsonProperty("1st")
  private Integer first;

  @JsonProperty("1st%")
  private Double firstPercentage;

  @JsonProperty("20+")
  private Integer twentyPlus;

  @JsonProperty("40+")
  private Integer fortyPlus;

  @JsonProperty("FUM")
  private Integer fumbles;

}
