/*
* This code has been generated by the Rebel: a code generator for modern Java.
* 
* For more details, please visit www.archetypesoftware.com.
*
* Drop us a line or two at feedback@archetypesoftware.com. We would love to hear from you.
*/
package rebel;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAFqEL+umRp+/yI= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAFqEL+umRp+/yI= >>
// ----------- >>
public class Player {
  // ----------- << attribute.annotations@AAAAAAFqEN3vMB6cSgU= >>
  // ----------- >>
  private int  wins;

  // ----------- << attribute.annotations@AAAAAAFqEOsueyfBRe4= >>
  // ----------- >>
  private enum mark;
  

  private int getWins() {
    return this.wins;
  }
  private enum getMark() {
    return mark;
  }

  public Board getBoard() {
    return board;
  }

  private void setWins(int  wins) {
    this.wins = wins;
  }

  private void setMark(enum mark) {
    this.mark = mark;
  }

  public void setBoard(Board board) {
    this.board = board;
  }

  public void linkBoard(Board _board) {
    if (_board != null) {
      _board.getPlayers().add(this);
    }

    unlinkBoard();
    setBoard(_board);
  }

  public void unlinkBoard() {
    if (getBoard() != null) {
      getBoard().getPlayers().remove(this);
      setBoard(null);
    }
  }

  // ----------- << method.annotations@AAAAAAFqEOYmmyOCXmM= >>
  // ----------- >>
  public void SetMove() {
  // ----------- << method.body@AAAAAAFqEOYmmyOCXmM= >>
  // ----------- >>
  }
// ----------- << class.extras@AAAAAAFqEL+umRp+/yI= >>
// ----------- >>
}