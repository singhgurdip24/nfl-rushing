package com.project.nflrushing.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.nflrushing.Model.Player;
import com.project.nflrushing.Payload.PlayerResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

  public PlayerResponse getPlayers(Integer offset, Integer limit, String orderBy, String sortBy)
    throws IOException {

    ObjectMapper objectMapper = new ObjectMapper();

    //read json file and convert to player object array
    List<Player> playerList = Arrays.asList(
      objectMapper.readValue(ResourceUtils.getFile("classpath:rushing.json"), Player[].class)
    );

    Integer numberOfRecords = playerList.size();

    List<Player> subPlayerList = playerList.subList(
      Math.min(playerList.size(), offset),
      Math.min(playerList.size(), offset + limit));


    PlayerResponse playerResponse = new PlayerResponse(numberOfRecords,subPlayerList);
    return playerResponse;
  }

}
