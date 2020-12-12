package com.project.nflrushing.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.nflrushing.Model.Player;
import com.project.nflrushing.Payload.PlayerResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

  public PlayerResponse getPlayers(Integer offset, Integer limit, String sortOrder, String sortByField)
    throws IOException {

    ObjectMapper objectMapper = new ObjectMapper();

    //read json file and convert to player object array
    List<Player> playerList = Arrays.asList(
      objectMapper.readValue(ResourceUtils.getFile("classpath:rushing.json"), Player[].class)
    );

    Integer numberOfRecords = playerList.size();

    System.out.println("sortByField:" + sortByField);
    switch (sortByField){
      case "yds":
        playerList = sortPlayerListByYds(playerList,sortOrder);
        break;
      case "lng":
        playerList = sortPlayerListByLng(playerList,sortOrder);
        break;
      case "td":
        playerList = sortPlayerListByTd(playerList,sortOrder);
        break;
      default:
        //do nothing

    }

    List<Player> subPlayerList = playerList.subList(
      Math.min(playerList.size(), offset),
      Math.min(playerList.size(), offset + limit));

    PlayerResponse playerResponse = new PlayerResponse(numberOfRecords,subPlayerList);
    return playerResponse;
  }

  private List<Player> sortPlayerListByTd(List<Player> playerList, String sortOrder) {

    if(sortOrder.equals("DESC")) {
      return playerList
        .stream()
        .sorted(Comparator.comparing(Player::getTd).reversed()).collect(Collectors.toList());
    } else {
      return playerList
        .stream()
        .sorted(Comparator.comparing(Player::getTd)).collect(Collectors.toList());
    }
  }

  private List<Player> sortPlayerListByLng(List<Player> playerList, String sortOrder) {
    return playerList
      .stream()
      .sorted((p1,p2) -> {
       String p1Lng = p1.getLng();
       String p2Lng = p2.getLng();

       Integer p1LngInt;
       Integer p2LngInt;

       if(p1Lng.charAt(p1Lng.length()-1) == 'T') {
         p1LngInt = Integer.parseInt(p1Lng.substring(0,p1Lng.length()-1));
       } else {
         p1LngInt = Integer.parseInt(p1Lng);
       }

        if(p2Lng.charAt(p2Lng.length()-1) == 'T') {
          p2LngInt = Integer.parseInt(p2Lng.substring(0,p2Lng.length()-1));
        } else {
          p2LngInt = Integer.parseInt(p2Lng);
        }

        if(sortOrder.equals("DESC")) {
          return p2LngInt-p1LngInt;
        } else {
          return p1LngInt-p2LngInt;
        }

      }).collect(Collectors.toList());
  }

  private List<Player> sortPlayerListByYds(List<Player> playerList, String sortOrder) {

    if(sortOrder.equals("DESC")) {
      return playerList
        .stream()
        .sorted(Comparator.comparing(Player::getYds).reversed()).collect(Collectors.toList());
    } else {
        return playerList
          .stream()
          .sorted(Comparator.comparing(Player::getYds)).collect(Collectors.toList());
    }
  }


}
