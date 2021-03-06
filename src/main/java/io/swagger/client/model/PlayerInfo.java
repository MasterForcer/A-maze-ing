/*
 * A-maze-ing API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The data structure that represents information related to a player.
 */
@ApiModel(description = "The data structure that represents information related to a player.")
public class PlayerInfo {
  @SerializedName("playerId")
  private String playerId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("isInPlaythrough")
  private Boolean isInPlaythrough = null;

  @SerializedName("maze")
  private String maze = null;

  @SerializedName("hasFoundEasterEgg")
  private Boolean hasFoundEasterEgg = null;

  @SerializedName("mazeScoreInHand")
  private Integer mazeScoreInHand = null;

  @SerializedName("mazeScoreInBag")
  private Integer mazeScoreInBag = null;

  @SerializedName("playerScore")
  private Integer playerScore = null;

  public PlayerInfo playerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

   /**
   * The public unique identifier of a player.
   * @return playerId
  **/
  @ApiModelProperty(value = "The public unique identifier of a player.")
  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public PlayerInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name a player has chosen to represent her.
   * @return name
  **/
  @ApiModelProperty(value = "The name a player has chosen to represent her.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlayerInfo isInPlaythrough(Boolean isInPlaythrough) {
    this.isInPlaythrough = isInPlaythrough;
    return this;
  }

   /**
   * An indication of whether a player is currently playing a maze or not.
   * @return isInPlaythrough
  **/
  @ApiModelProperty(value = "An indication of whether a player is currently playing a maze or not.")
  public Boolean isIsInPlaythrough() {
    return isInPlaythrough;
  }

  public void setIsInPlaythrough(Boolean isInPlaythrough) {
    this.isInPlaythrough = isInPlaythrough;
  }

  public PlayerInfo maze(String maze) {
    this.maze = maze;
    return this;
  }

   /**
   * The name of the maze the player is currently playing. Might be null if player  is not currently playing a maze.
   * @return maze
  **/
  @ApiModelProperty(value = "The name of the maze the player is currently playing. Might be null if player  is not currently playing a maze.")
  public String getMaze() {
    return maze;
  }

  public void setMaze(String maze) {
    this.maze = maze;
  }

  public PlayerInfo hasFoundEasterEgg(Boolean hasFoundEasterEgg) {
    this.hasFoundEasterEgg = hasFoundEasterEgg;
    return this;
  }

   /**
   * Wink wink.
   * @return hasFoundEasterEgg
  **/
  @ApiModelProperty(value = "Wink wink.")
  public Boolean isHasFoundEasterEgg() {
    return hasFoundEasterEgg;
  }

  public void setHasFoundEasterEgg(Boolean hasFoundEasterEgg) {
    this.hasFoundEasterEgg = hasFoundEasterEgg;
  }

  public PlayerInfo mazeScoreInHand(Integer mazeScoreInHand) {
    this.mazeScoreInHand = mazeScoreInHand;
    return this;
  }

   /**
   * How much score the player has in her hand. Only available if player is playing a maze.
   * @return mazeScoreInHand
  **/
  @ApiModelProperty(value = "How much score the player has in her hand. Only available if player is playing a maze.")
  public Integer getMazeScoreInHand() {
    return mazeScoreInHand;
  }

  public void setMazeScoreInHand(Integer mazeScoreInHand) {
    this.mazeScoreInHand = mazeScoreInHand;
  }

  public PlayerInfo mazeScoreInBag(Integer mazeScoreInBag) {
    this.mazeScoreInBag = mazeScoreInBag;
    return this;
  }

   /**
   * How much score the player has in her bag. Only available if player is playing a maze.
   * @return mazeScoreInBag
  **/
  @ApiModelProperty(value = "How much score the player has in her bag. Only available if player is playing a maze.")
  public Integer getMazeScoreInBag() {
    return mazeScoreInBag;
  }

  public void setMazeScoreInBag(Integer mazeScoreInBag) {
    this.mazeScoreInBag = mazeScoreInBag;
  }

  public PlayerInfo playerScore(Integer playerScore) {
    this.playerScore = playerScore;
    return this;
  }

   /**
   * The accumulated score across all played mazes.
   * @return playerScore
  **/
  @ApiModelProperty(value = "The accumulated score across all played mazes.")
  public Integer getPlayerScore() {
    return playerScore;
  }

  public void setPlayerScore(Integer playerScore) {
    this.playerScore = playerScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerInfo playerInfo = (PlayerInfo) o;
    return Objects.equals(this.playerId, playerInfo.playerId) &&
        Objects.equals(this.name, playerInfo.name) &&
        Objects.equals(this.isInPlaythrough, playerInfo.isInPlaythrough) &&
        Objects.equals(this.maze, playerInfo.maze) &&
        Objects.equals(this.hasFoundEasterEgg, playerInfo.hasFoundEasterEgg) &&
        Objects.equals(this.mazeScoreInHand, playerInfo.mazeScoreInHand) &&
        Objects.equals(this.mazeScoreInBag, playerInfo.mazeScoreInBag) &&
        Objects.equals(this.playerScore, playerInfo.playerScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerId, name, isInPlaythrough, maze, hasFoundEasterEgg, mazeScoreInHand, mazeScoreInBag, playerScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerInfo {\n");

    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isInPlaythrough: ").append(toIndentedString(isInPlaythrough)).append("\n");
    sb.append("    maze: ").append(toIndentedString(maze)).append("\n");
    sb.append("    hasFoundEasterEgg: ").append(toIndentedString(hasFoundEasterEgg)).append("\n");
    sb.append("    mazeScoreInHand: ").append(toIndentedString(mazeScoreInHand)).append("\n");
    sb.append("    mazeScoreInBag: ").append(toIndentedString(mazeScoreInBag)).append("\n");
    sb.append("    playerScore: ").append(toIndentedString(playerScore)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

