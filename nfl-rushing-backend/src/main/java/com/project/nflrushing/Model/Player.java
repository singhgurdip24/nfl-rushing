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
  private String att;

  @JsonProperty("Att/G")
  private String attPerG;

  @JsonProperty("Yds")
  private String yds;

  @JsonProperty("Avg")
  private String avg;

  @JsonProperty("Yds/G")
  private String ydsPerG;

  @JsonProperty("TD")
  private String td;

  @JsonProperty("Lng")
  private String lng;

  @JsonProperty("1st")
  private String first;

  @JsonProperty("1st%")
  private String firstPercentage;

  @JsonProperty("20+")
  private String twentyPlus;

  @JsonProperty("40+")
  private String fortyPlus;

  @JsonProperty("FUM")
  private String fumbles;

}
