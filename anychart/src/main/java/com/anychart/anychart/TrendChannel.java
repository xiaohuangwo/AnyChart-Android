package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TrendChannel extends JsObject {

    
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    private Fill fill;

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    private String color1;
    private Double opacity;

    public void setFill(String color1, Double opacity) {
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private Rect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }


    public void setFill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }

    private Fill imageSettings;
    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color2;
    private Double thickness;
    private Double size;

    public void setHatchfill(PatternFill patternFillOrType, String color2, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        
        this.patternFillOrType = patternFillOrType;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setHatchfill(HatchFill patternFillOrType1, String color2, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        
        this.patternFillOrType1 = patternFillOrType1;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setHatchfill(HatchFillType patternFillOrType2, String color2, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        
        this.patternFillOrType2 = patternFillOrType2;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setHatchfill(String patternFillOrType3, String color2, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        
        this.patternFillOrType3 = patternFillOrType3;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setHatchfill(Boolean patternFillOrType4, String color2, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        
        this.patternFillOrType4 = patternFillOrType4;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }

    private Fill hoverFill;

    public void setHoverfill(Fill hoverFill) {
        this.hoverFill = hoverFill;
    }

    private String color3;
    private Double opacity3;

    public void setHoverfill(String color3, Double opacity3) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        
        this.color3 = color3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode3;
    private Rect mode4;
    private Double opacity4;

    public void setHoverfill(GradientKey[] keys4, Boolean mode3, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys4 = keys4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode3 = mode3;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setHoverfill(GradientKey[] keys4, Rect mode4, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys4 = keys4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode4 = mode4;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setHoverfill(String[] keys5, Boolean mode3, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys5 = keys5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode3 = mode3;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setHoverfill(String[] keys5, Rect mode4, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys5 = keys5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode4 = mode4;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private Rect mode5;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setHoverfill(GradientKey[] keys6, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        
        this.keys6 = keys6;
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        
        this.mode5 = mode5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        
        this.opacity5 = opacity5;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setHoverfill(String[] keys7, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        
        this.keys7 = keys7;
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        
        this.mode5 = mode5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        
        this.opacity5 = opacity5;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }

    private Fill imageSettings1;
    private PatternFill patternFillOrType5;
    private HatchFill patternFillOrType6;
    private HatchFillType patternFillOrType7;
    private String patternFillOrType8;
    private Boolean patternFillOrType9;
    private String color4;
    private Double thickness1;
    private Double size1;

    public void setHoverhatchfill(PatternFill patternFillOrType5, String color4, Double thickness1, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        
        this.patternFillOrType5 = patternFillOrType5;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setHoverhatchfill(HatchFill patternFillOrType6, String color4, Double thickness1, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        
        this.patternFillOrType6 = patternFillOrType6;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setHoverhatchfill(HatchFillType patternFillOrType7, String color4, Double thickness1, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        
        this.patternFillOrType7 = patternFillOrType7;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setHoverhatchfill(String patternFillOrType8, String color4, Double thickness1, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        
        this.patternFillOrType8 = patternFillOrType8;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setHoverhatchfill(Boolean patternFillOrType9, String color4, Double thickness1, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        
        this.patternFillOrType9 = patternFillOrType9;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }

    private Boolean hoverMarkers;
    private String hoverMarkers1;

    public void setHovermarkers(Boolean hoverMarkers) {
        this.hoverMarkers = null;
        this.hoverMarkers1 = null;
        
        this.hoverMarkers = hoverMarkers;
    }


    public void setHovermarkers(String hoverMarkers1) {
        this.hoverMarkers = null;
        this.hoverMarkers1 = null;
        
        this.hoverMarkers1 = hoverMarkers1;
    }

    private Stroke color5;
    private ColoredFill color6;
    private String color7;
    private Double thickness2;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setHoverstroke(Stroke color5, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        
        this.color5 = color5;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setHoverstroke(ColoredFill color6, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        
        this.color6 = color6;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setHoverstroke(String color7, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        
        this.color7 = color7;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private Boolean markers;
    private String markers1;

    public void setMarkers(Boolean markers) {
        this.markers = null;
        this.markers1 = null;
        
        this.markers = markers;
    }


    public void setMarkers(String markers1) {
        this.markers = null;
        this.markers1 = null;
        
        this.markers1 = markers1;
    }

    private Fill selectFill;

    public void setSelectfill(Fill selectFill) {
        this.selectFill = selectFill;
    }

    private String color8;
    private Double opacity6;

    public void setSelectfill(String color8, Double opacity6) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        
        this.color8 = color8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        
        this.opacity6 = opacity6;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode6;
    private Rect mode7;
    private Double opacity7;

    public void setSelectfill(GradientKey[] keys8, Boolean mode6, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys8 = keys8;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode6 = mode6;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setSelectfill(GradientKey[] keys8, Rect mode7, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys8 = keys8;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode7 = mode7;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setSelectfill(String[] keys9, Boolean mode6, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys9 = keys9;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode6 = mode6;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setSelectfill(String[] keys9, Rect mode7, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys9 = keys9;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode7 = mode7;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private Rect mode8;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setSelectfill(GradientKey[] keys10, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        
        this.keys10 = keys10;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        
        this.cx2 = cx2;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        
        this.cy2 = cy2;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        
        this.mode8 = mode8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        
        this.opacity8 = opacity8;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        
        this.fx2 = fx2;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        
        this.fy2 = fy2;
    }


    public void setSelectfill(String[] keys11, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        
        this.keys11 = keys11;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        
        this.cx2 = cx2;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        
        this.cy2 = cy2;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        
        this.mode8 = mode8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        
        this.opacity8 = opacity8;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        
        this.fx2 = fx2;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        
        this.fy2 = fy2;
    }

    private Fill imageSettings2;
    private PatternFill patternFillOrType10;
    private HatchFill patternFillOrType11;
    private HatchFillType patternFillOrType12;
    private String patternFillOrType13;
    private Boolean patternFillOrType14;
    private String color9;
    private Double thickness3;
    private Double size2;

    public void setSelecthatchfill(PatternFill patternFillOrType10, String color9, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        
        this.patternFillOrType10 = patternFillOrType10;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setSelecthatchfill(HatchFill patternFillOrType11, String color9, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        
        this.patternFillOrType11 = patternFillOrType11;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setSelecthatchfill(HatchFillType patternFillOrType12, String color9, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        
        this.patternFillOrType12 = patternFillOrType12;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setSelecthatchfill(String patternFillOrType13, String color9, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        
        this.patternFillOrType13 = patternFillOrType13;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setSelecthatchfill(Boolean patternFillOrType14, String color9, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        
        this.patternFillOrType14 = patternFillOrType14;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }

    private Boolean selectMarkers;
    private String selectMarkers1;

    public void setSelectmarkers(Boolean selectMarkers) {
        this.selectMarkers = null;
        this.selectMarkers1 = null;
        
        this.selectMarkers = selectMarkers;
    }


    public void setSelectmarkers(String selectMarkers1) {
        this.selectMarkers = null;
        this.selectMarkers1 = null;
        
        this.selectMarkers1 = selectMarkers1;
    }

    private Stroke color10;
    private ColoredFill color11;
    private String color12;
    private Double thickness4;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setSelectstroke(Stroke color10, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        
        this.color10 = color10;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }


    public void setSelectstroke(ColoredFill color11, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        
        this.color11 = color11;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }


    public void setSelectstroke(String color12, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        
        this.color12 = color12;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }

    private Stroke color13;
    private ColoredFill color14;
    private String color15;
    private Double thickness5;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setStroke(Stroke color13, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        
        this.color13 = color13;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }


    public void setStroke(ColoredFill color14, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        
        this.color14 = color14;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }


    public void setStroke(String color15, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        
        this.color15 = color15;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }

    private Base xScale;
    private StockScatterDateTime xScale1;

    public void setXscale(Base xScale) {
        this.xScale = null;
        this.xScale1 = null;
        
        this.xScale = xScale;
    }


    public void setXscale(StockScatterDateTime xScale1) {
        this.xScale = null;
        this.xScale1 = null;
        
        this.xScale1 = xScale1;
    }

    private Base yScale;

    public void setYscale(Base yScale) {
        this.yScale = yScale;
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", (mode2 != null) ? mode2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType() {
        if (patternFillOrType != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType1() {
        if (patternFillOrType1 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType2() {
        if (patternFillOrType2 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType3() {
        if (patternFillOrType3 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType3);
        }
        return "";
    }

    private String generateJSpatternFillOrType4() {
        if (patternFillOrType4 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType4);
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", color2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJShoverFill() {
        if (hoverFill != null) {
            return String.format(Locale.US, "hoverFill: %s,", (hoverFill != null) ? hoverFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", color3);
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
        }
        return "";
    }

    private String generateJSkeys4() {
        if (keys4 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys4));
        }
        return "";
    }

    private String generateJSkeys5() {
        if (keys5 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys5));
        }
        return "";
    }

    private String generateJSangle1() {
        if (angle1 != null) {
            return String.format(Locale.US, "angle: %f,", angle1);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %b,", mode3);
        }
        return "";
    }

    private String generateJSmode4() {
        if (mode4 != null) {
            return String.format(Locale.US, "mode: %s,", (mode4 != null) ? mode4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity4() {
        if (opacity4 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity4);
        }
        return "";
    }

    private String generateJSkeys6() {
        if (keys6 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys6));
        }
        return "";
    }

    private String generateJSkeys7() {
        if (keys7 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys7));
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSmode5() {
        if (mode5 != null) {
            return String.format(Locale.US, "mode: %s,", (mode5 != null) ? mode5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity5() {
        if (opacity5 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity5);
        }
        return "";
    }

    private String generateJSfx1() {
        if (fx1 != null) {
            return String.format(Locale.US, "fx: %f,", fx1);
        }
        return "";
    }

    private String generateJSfy1() {
        if (fy1 != null) {
            return String.format(Locale.US, "fy: %f,", fy1);
        }
        return "";
    }

    private String generateJSimageSettings1() {
        if (imageSettings1 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings1 != null) ? imageSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType5() {
        if (patternFillOrType5 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType6() {
        if (patternFillOrType6 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType7() {
        if (patternFillOrType7 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType8() {
        if (patternFillOrType8 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType8);
        }
        return "";
    }

    private String generateJSpatternFillOrType9() {
        if (patternFillOrType9 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType9);
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", color4);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %f,", size1);
        }
        return "";
    }

    private String generateJShoverMarkers() {
        if (hoverMarkers != null) {
            return String.format(Locale.US, "hoverMarkers: %b,", hoverMarkers);
        }
        return "";
    }

    private String generateJShoverMarkers1() {
        if (hoverMarkers1 != null) {
            return String.format(Locale.US, "hoverMarkers: %s,", hoverMarkers1);
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", (color5 != null) ? color5.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: %s,", (color6 != null) ? color6.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: %s,", color7);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmarkers() {
        if (markers != null) {
            return String.format(Locale.US, "markers: %b,", markers);
        }
        return "";
    }

    private String generateJSmarkers1() {
        if (markers1 != null) {
            return String.format(Locale.US, "markers: %s,", markers1);
        }
        return "";
    }

    private String generateJSselectFill() {
        if (selectFill != null) {
            return String.format(Locale.US, "selectFill: %s,", (selectFill != null) ? selectFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: %s,", color8);
        }
        return "";
    }

    private String generateJSopacity6() {
        if (opacity6 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity6);
        }
        return "";
    }

    private String generateJSkeys8() {
        if (keys8 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys8));
        }
        return "";
    }

    private String generateJSkeys9() {
        if (keys9 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys9));
        }
        return "";
    }

    private String generateJSangle2() {
        if (angle2 != null) {
            return String.format(Locale.US, "angle: %f,", angle2);
        }
        return "";
    }

    private String generateJSmode6() {
        if (mode6 != null) {
            return String.format(Locale.US, "mode: %b,", mode6);
        }
        return "";
    }

    private String generateJSmode7() {
        if (mode7 != null) {
            return String.format(Locale.US, "mode: %s,", (mode7 != null) ? mode7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity7() {
        if (opacity7 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity7);
        }
        return "";
    }

    private String generateJSkeys10() {
        if (keys10 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys10));
        }
        return "";
    }

    private String generateJSkeys11() {
        if (keys11 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys11));
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSmode8() {
        if (mode8 != null) {
            return String.format(Locale.US, "mode: %s,", (mode8 != null) ? mode8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity8() {
        if (opacity8 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity8);
        }
        return "";
    }

    private String generateJSfx2() {
        if (fx2 != null) {
            return String.format(Locale.US, "fx: %f,", fx2);
        }
        return "";
    }

    private String generateJSfy2() {
        if (fy2 != null) {
            return String.format(Locale.US, "fy: %f,", fy2);
        }
        return "";
    }

    private String generateJSimageSettings2() {
        if (imageSettings2 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings2 != null) ? imageSettings2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType10() {
        if (patternFillOrType10 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType11() {
        if (patternFillOrType11 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType12() {
        if (patternFillOrType12 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType13() {
        if (patternFillOrType13 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType13);
        }
        return "";
    }

    private String generateJSpatternFillOrType14() {
        if (patternFillOrType14 != null) {
            return String.format(Locale.US, "patternFillOrType: %b,", patternFillOrType14);
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: %s,", color9);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSsize2() {
        if (size2 != null) {
            return String.format(Locale.US, "size: %f,", size2);
        }
        return "";
    }

    private String generateJSselectMarkers() {
        if (selectMarkers != null) {
            return String.format(Locale.US, "selectMarkers: %b,", selectMarkers);
        }
        return "";
    }

    private String generateJSselectMarkers1() {
        if (selectMarkers1 != null) {
            return String.format(Locale.US, "selectMarkers: %s,", selectMarkers1);
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: %s,", (color10 != null) ? color10.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: %s,", (color11 != null) ? color11.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor12() {
        if (color12 != null) {
            return String.format(Locale.US, "color: %s,", color12);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor13() {
        if (color13 != null) {
            return String.format(Locale.US, "color: %s,", (color13 != null) ? color13.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor14() {
        if (color14 != null) {
            return String.format(Locale.US, "color: %s,", (color14 != null) ? color14.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor15() {
        if (color15 != null) {
            return String.format(Locale.US, "color: %s,", color15);
        }
        return "";
    }

    private String generateJSthickness5() {
        if (thickness5 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness5);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxScale() {
        if (xScale != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale != null) ? xScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxScale1() {
        if (xScale1 != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale1 != null) ? xScale1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale() {
        if (yScale != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale != null) ? yScale.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJScolor());
        js.append(generateJSfill());
        js.append(generateJScolor1());
        js.append(generateJSopacity());
        js.append(generateJSkeys());
        js.append(generateJSkeys1());
        js.append(generateJSangle());
        js.append(generateJSmode());
        js.append(generateJSmode1());
        js.append(generateJSopacity1());
        js.append(generateJSkeys2());
        js.append(generateJSkeys3());
        js.append(generateJScx());
        js.append(generateJScy());
        js.append(generateJSmode2());
        js.append(generateJSopacity2());
        js.append(generateJSfx());
        js.append(generateJSfy());
        js.append(generateJSimageSettings());
        js.append(generateJSpatternFillOrType());
        js.append(generateJSpatternFillOrType1());
        js.append(generateJSpatternFillOrType2());
        js.append(generateJSpatternFillOrType3());
        js.append(generateJSpatternFillOrType4());
        js.append(generateJScolor2());
        js.append(generateJSthickness());
        js.append(generateJSsize());
        js.append(generateJShoverFill());
        js.append(generateJScolor3());
        js.append(generateJSopacity3());
        js.append(generateJSkeys4());
        js.append(generateJSkeys5());
        js.append(generateJSangle1());
        js.append(generateJSmode3());
        js.append(generateJSmode4());
        js.append(generateJSopacity4());
        js.append(generateJSkeys6());
        js.append(generateJSkeys7());
        js.append(generateJScx1());
        js.append(generateJScy1());
        js.append(generateJSmode5());
        js.append(generateJSopacity5());
        js.append(generateJSfx1());
        js.append(generateJSfy1());
        js.append(generateJSimageSettings1());
        js.append(generateJSpatternFillOrType5());
        js.append(generateJSpatternFillOrType6());
        js.append(generateJSpatternFillOrType7());
        js.append(generateJSpatternFillOrType8());
        js.append(generateJSpatternFillOrType9());
        js.append(generateJScolor4());
        js.append(generateJSthickness1());
        js.append(generateJSsize1());
        js.append(generateJShoverMarkers());
        js.append(generateJShoverMarkers1());
        js.append(generateJScolor5());
        js.append(generateJScolor6());
        js.append(generateJScolor7());
        js.append(generateJSthickness2());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJSmarkers());
        js.append(generateJSmarkers1());
        js.append(generateJSselectFill());
        js.append(generateJScolor8());
        js.append(generateJSopacity6());
        js.append(generateJSkeys8());
        js.append(generateJSkeys9());
        js.append(generateJSangle2());
        js.append(generateJSmode6());
        js.append(generateJSmode7());
        js.append(generateJSopacity7());
        js.append(generateJSkeys10());
        js.append(generateJSkeys11());
        js.append(generateJScx2());
        js.append(generateJScy2());
        js.append(generateJSmode8());
        js.append(generateJSopacity8());
        js.append(generateJSfx2());
        js.append(generateJSfy2());
        js.append(generateJSimageSettings2());
        js.append(generateJSpatternFillOrType10());
        js.append(generateJSpatternFillOrType11());
        js.append(generateJSpatternFillOrType12());
        js.append(generateJSpatternFillOrType13());
        js.append(generateJSpatternFillOrType14());
        js.append(generateJScolor9());
        js.append(generateJSthickness3());
        js.append(generateJSsize2());
        js.append(generateJSselectMarkers());
        js.append(generateJSselectMarkers1());
        js.append(generateJScolor10());
        js.append(generateJScolor11());
        js.append(generateJScolor12());
        js.append(generateJSthickness4());
        js.append(generateJSdashpattern1());
        js.append(generateJSlineJoin1());
        js.append(generateJSlineCap1());
        js.append(generateJScolor13());
        js.append(generateJScolor14());
        js.append(generateJScolor15());
        js.append(generateJSthickness5());
        js.append(generateJSdashpattern2());
        js.append(generateJSlineJoin2());
        js.append(generateJSlineCap2());
        js.append(generateJSxScale());
        js.append(generateJSxScale1());
        js.append(generateJSyScale());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}