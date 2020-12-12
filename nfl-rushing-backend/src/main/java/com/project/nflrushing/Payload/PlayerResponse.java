package com.project.nflrushing.Payload;

import com.project.nflrushing.Model.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerResponse {
  private Integer numberOfRecords;
  private List<Player> playerList;
}
