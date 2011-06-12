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

public class CompleteTip extends CompactTip {
  
  private static final long serialVersionUID = 5606985476553828335L;
  
  public UserGroups getTodo() {
    return todo;
  }
  
  public UserGroups getDone() {
    return done;
  }
  
  private UserGroups todo;
  private UserGroups done;
}
