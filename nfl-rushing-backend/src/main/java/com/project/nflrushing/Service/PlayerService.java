package com.project.nflrushing.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.nflrushing.Model.Player;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

  public List<Player> getPlayers(Integer offset, Integer limit, String orderBy, String sortBy)
    throws IOException {

    ObjectMapper objectMapper = new ObjectMapper();

    //read json file and convert to player object array
    Player[] playerArray = objectMapper.readValue(ResourceUtils.getFile("classpath:rushing.json"), Player[].class);

    return Arrays.asList(playerArray);
  }

}
