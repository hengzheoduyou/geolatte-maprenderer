/*
 * This file is part of the GeoLatte project.
 *
 *     GeoLatte is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     GeoLatte is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with GeoLatte.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Copyright (C) 2010 - 2011 and Ownership of code is shared by:
 *  Qmino bvba - Esperantolaan 4 - 3001 Heverlee  (http://www.qmino.com)
 *  Geovise bvba - Generaal Eisenhowerlei 9 - 2140 Antwerpen (http://www.geovise.com)
 */

package org.geolatte.maprenderer.sld.graphics;

import org.geolatte.geom.Feature;
import org.geolatte.geom.Position;
import org.geolatte.maprenderer.map.MapGraphics;

import java.awt.*;

@Deprecated
public class TextSymbolizer {

    private String labelProperty = null;
    private String fontFamily = "SERIF";
    private int fontStyle = 0;
    private int fontSize = 10;

    public void setLabelProperty(String property) {
        this.labelProperty = property;

    }

    public void setFontFamily(String font) {
        this.fontFamily = font;
    }

    public void setFontStyle(int style) {
        this.fontStyle += style;
    }

    public void setFontSize(int size) {
        this.fontSize = size;
    }

    public String getLabelProperty() {
        return labelProperty;
    }

    public Font getFont() {
        return new Font(fontFamily, fontStyle, fontSize);
    }

    public void symbolize(Feature feature) {
        throw new UnsupportedOperationException();
    }

    public void setGraphics(MapGraphics graphics) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
