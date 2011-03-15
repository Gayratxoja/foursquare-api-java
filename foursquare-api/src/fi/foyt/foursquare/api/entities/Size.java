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

public class Size extends FoursquareEntity {

  public Integer getHeight() {
    return height;
  }
  
  public String getUrl() {
    return url;
  }
  
  public Integer getWidth() {
    return width;
  }
  
  private String url;
  private Integer width;
  private Integer height;
}
