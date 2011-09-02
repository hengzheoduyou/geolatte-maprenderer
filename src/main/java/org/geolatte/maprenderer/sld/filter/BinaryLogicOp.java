/*
 * Copyright (c) 2011. Geovise BVBA, QMINO BVBA
 *
 * This file is part of GeoLatte Mapserver.
 *
 * GeoLatte Mapserver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GeoLatte Mapserver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GeoLatte Mapserver.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.geolatte.maprenderer.sld.filter;

public abstract class BinaryLogicOp extends Expression<Boolean, Boolean> {

    private Expression<Boolean, ?>[] operands;


    public Expression<Boolean, ?>[] getOperands() {
        return operands;
    }

    public void setArg(int i, Expression<Boolean, ?> operand) {
        this.operands[i] = operand;
    }

    public int getNumArgs() {
        return 2;
    }


}
