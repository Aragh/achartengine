/**
 * Copyright (C) 2009 - 2013 SC 4ViewSoft SRL
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.achartengine.tools;

import org.achartengine.chart.RoundChart;

/**
 * A zoom event.
 */
public class ZoomEvent {
  /** A flag to be used to know if this is a zoom in or out. */
  private boolean mZoomIn;
  /** The zoom rate. */
  private float mZoomRate;
  /** Current zoom level on X axis */
  private double mZoomXLevel;
  /** Current zoom level on Y axis */
  private double mZoomYLevel;


  /**
   * Builds the zoom tool. When using this constructor zoom level is set to {@literal Double.POSITIVE_INFINITY}.
   *
   * @param in zoom in or out
   * @param rate the zoom rate
   */
  public ZoomEvent(boolean in, float rate) {
    this(in, rate, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
  }

  /**
   * Builds the zoom tool.
   * 
   * @param in zoom in or out
   * @param rate the zoom rate
   * @param zoomXLevel zoom level for x axis
   * @param zoomYLevel zoom level for y axis
   */
  public ZoomEvent(boolean in, float rate, double zoomXLevel, double zoomYLevel) {
    mZoomIn = in;
    mZoomRate = rate;
    mZoomXLevel = zoomXLevel;
    mZoomYLevel = zoomYLevel;
  }

  /**
   * Returns the zoom type.
   * 
   * @return true if zoom in, false otherwise
   */
  public boolean isZoomIn() {
    return mZoomIn;
  }
  
  /**
   * Returns the zoom rate.
   * 
   * @return the zoom rate
   */
  public float getZoomRate() {
    return mZoomRate;
  }

  /**
   * Returns current zoom level on X axis.
   * For {@link RoundChart} it returns {@literal Double.POSITIVE_INFINITY}.
   *
   * @return the zoom level
   */
  public double getZoomXLevel() {
    return mZoomXLevel;
  }

  /**
   * Returns current zoom level on Y axis.
   * For {@link RoundChart} it returns {@literal Double.POSITIVE_INFINITY}.
   *
   * @return the zoom level
   */
  public double getZoomYLevel() {
      return mZoomYLevel;
  }
}
