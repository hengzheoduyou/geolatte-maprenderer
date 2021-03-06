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

package org.geolatte.maprenderer.map;

import org.geolatte.geom.C2D;
import org.geolatte.geom.Envelope;
import org.geolatte.geom.Feature;

/**
 * Paints features  onto a <code>MapGraphics</code>.
 *
 *<p><code>Painter</code>s are not thread-safe.</p>
 *
 * @author Karel Maesen, Geovise BVBA
 *
 */
public interface Painter {

    /**
     * Allows the Painter to signal that it will paint features
     * @return
     */
    default boolean willPaint(){
        return true;
    }

    void paint(PlanarFeature feature);

    default void paint(Iterable<PlanarFeature> features) {
        features.forEach( this::paint );
    }

    default Envelope<C2D> envelope(PlanarFeature f){
        return f.getGeometry().getEnvelope();
    }

}
