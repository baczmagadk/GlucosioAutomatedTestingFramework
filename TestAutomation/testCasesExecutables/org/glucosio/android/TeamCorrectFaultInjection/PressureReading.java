/*
 * Copyright (C) 2016 Glucosio Foundation
 *
 * This file is part of Glucosio.
 *
 * Glucosio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * Glucosio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Glucosio.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package org.glucosio.android.TeamCorrectFaultInjection;

//Fault Injection #4

import java.util.Date;

public class PressureReading  {
    
    private long id;

    private double minReading = 0.0;
    private double maxReading = 0.0;
    private Date created;

    public PressureReading() {
    }

    public PressureReading(double minReading, double maxReading, Date created) {
        // mm/Hg
        this.minReading = minReading;
        this.maxReading = maxReading;
        this.created = created;
    }

    public double getMinReading() {
        return minReading;
    }
//changed min to max
    public void setMinReading(double minReading) {
        this.maxReading = minReading;
    }

    public double getMaxReading() {
        return maxReading;
    }
//changed max to min
    public void setMaxReading(double maxReading) {
        this.minReading = maxReading;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
