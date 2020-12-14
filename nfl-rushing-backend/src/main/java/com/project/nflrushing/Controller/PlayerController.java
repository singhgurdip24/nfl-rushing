package com.project.nflrushing.Controller;

import com.project.nflrushing.Model.Player;
import com.project.nflrushing.Payload.PlayerResponse;
import com.project.nflrushing.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PlayerController {

  @Autowired
  private PlayerService playerService;

  @GetMapping("/details")
  public PlayerResponse getPlayerDetails(
    @RequestParam (value = "offset") Integer offset,
    @RequestParam (value = "limit") Integer limit,
    @RequestParam (value = "sortOrder", defaultValue = "ASC") String sortOrder,
    @RequestParam (value = "sortByField", defaultValue = "") String sortByField,
    @RequestParam (value = "filterByPlayer", required = false) String filterByPlayer
  ) throws IOException {

     return playerService.getPlayers(offset,limit,sortOrder,sortByField, filterByPlayer);
  }
}
