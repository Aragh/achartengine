AChartEngine Fork
=================

This is a fork of the [AChartEngine][1] library.


**Forked version**

```
r567 @ 20.05.2014
```

**Currently synchronized revision**

```
r567
```


Changelog
---------

10.09.2014:

* CategorySeries supports scale number which is passed to XYSeries when using transformation to this type. 


27.05.2014:

* Chart axis has configurable thickness. The thickness value can be configured in through 
  DefaultRenderer or SimpleSeriesRenderer object 

  ```java
    DefaultRenderer.setAxisThickness(pixels);
    SimpleSeriesRenderer.setAxisThickness(pixels);
  ```
  
  To reset axis thickness to default value set it to 
  
  ```java
    Integer.MAX_VALUE;
  ```
  
* In the similar way the grid thickness can be configured. In this case the value can be set separately for 
  horizontal and vertical lines.
  
  ```java
    DefaultRenderer.setGridXThickness(pixels);
    DefaultRenderer.setGridYThickness(pixels);
  ```
  
  Resetting thickness value can be performed by setting it to
  
  ```java
    Integer.MAX_VALUE;
  ```


26.05.2014:

* Zoom listener returns current zoom level through ZoomEvent separately for x and y axis.
  Level values can be obtained by:
  
  ```java
    ZoomEvent.getZoomXLevel();
    ZoomEvent.getZoomYLevel();
  ```
  
  For round chart methods listed above returns
  
  ```java
    Double.POSITIVE_INFINITY
  ```


25.05.2014:

* Removed Eclipse specific files form repository.


TODO
----

* When pan limits are set the initial range is ignored. Both should work.
* When the chart is zoomed in and panned to any of the limit values it can't be zoomed out. Limit reached check doesn't 
distinguish between sides. When done correctly the side of the chart that reached the limit should be fixed and the 
other side should zoom out revealing previously hidden data.


DONE
----

* Support scale number in CategorySeries class and pass it to XYSeries when converting to this type
* Zoom listener should return current zoom level. Currently it only returns change ratio.
* Axis should have configurable thickness.


[1]: https://code.google.com/p/achartengine/
