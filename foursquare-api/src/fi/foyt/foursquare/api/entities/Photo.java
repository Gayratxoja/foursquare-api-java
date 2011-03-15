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

public class Photo extends FoursquareEntity {

  public String getId() {
    return id;
  }
  
  public Long getCreatedAt() {
    return createdAt;
  }
  
  public String getUrl() {
    return url;
  }
  
  public SizeGroup getSizes() {
    return sizes;
  }
  
  public Source getSource() {
    return source;
  }
  
  public CompactUser getUser() {
    return user;
  }
  
  public CompactTip getTip() {
    return tip;
  }
  
  public Checkin getCheckin() {
    return checkin;
  }
  
  private String id;
  private Long createdAt;
  private String url;
  private SizeGroup sizes;
  private Source source;
  private CompactUser user;
  private CompactTip tip;
  private Checkin checkin;
}
