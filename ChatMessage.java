/** @file ChatMessage.java
 *
 *  @brief implements the ChatMessage obejct for use in the FSE chatroom
 *  application.  This object is passed between the server and users when a
 *  message is being broadcasted to users, and from users to the server when 
 *  a user enters a new message, querries users connected, or logs out
 *
 *  @author Nat Jeffries (njeffrie)
 */

import java.io.*;

/** @brief basic chat message object.  Stores the message in a string and keeps track
 * of what type of message it is.  Types include ordinary message, log out
 * command, and query for who else is in the chat room
 */
public class ChatMessage implements Serializable{
  //specific number borrowed from www.dreamincode.net/forums
  protected static final long serialVersionUID = 1112122200L;
  static final int QUERY_USERS = 0, LOG_OUT = 1, MESSAGE = 2;
  private int type;
  private String message;
  
  /** @brief chat message constructor
   *  @param msg_type type of message to be sent: users query, logout or msg
   *  @param message string message to be sent.  will be empty string if a 
   *  users query or logout command is being sent
   *  @return ChatMessage object
   */
  ChatMessage(int msg_type, String message){
    this.type = msg_type;
    this.message = message;
  }

  /** @brief message and type fetchers */
  int getType(){
    return type;
  }
  String getMessage(){
    return message;
  }
}
