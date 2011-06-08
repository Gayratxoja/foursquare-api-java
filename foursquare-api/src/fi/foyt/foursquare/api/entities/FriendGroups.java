/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */
package fi.foyt.foursquare.api.entities;

public class FriendGroups extends Count {

  private static final long serialVersionUID = -7444569523527922004L;

  public FriendGroup[] getGroups() {
    return groups;
  }
  
  private FriendGroup[] groups;
}
