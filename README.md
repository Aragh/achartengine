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

25.05.2014:

* Removed Eclipse specific files form repository.


TODO
----

* Zoom listener should return current zoom level. Currently it only returns change ratio.
* When pan limits are set the initial range is ignored. Both should work.
* Axis should have configurable thickness.
* When the chart is zoomed in and panned to any of the limit values it can't be zoomed out. Limit reached check doesn't 
distinguish between sides. When done correctly the side of the chart that reached the limit should be fixed and the 
other side should zoom out revealing previously hidden data.

[1]: https://code.google.com/p/achartengine/
