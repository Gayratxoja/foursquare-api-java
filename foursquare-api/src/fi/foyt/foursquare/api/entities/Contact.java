/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Lepp� / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 2.1 or later (the "LGPL") 
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Contact extends FoursquareEntity {
  
  public String getPhone() {
    return phone;
  }
  
  public String getTwitter() {
    return twitter;
  }
  
  public String getEmail() {
    return email;
  }
  
  public String getFacebook() {
    return facebook;
  }
  
  private String email;
  private String facebook;
  private String twitter;
  private String phone;
}
