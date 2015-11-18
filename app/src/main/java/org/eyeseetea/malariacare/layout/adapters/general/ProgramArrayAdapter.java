/*
 * Copyright (c) 2015.
 *
 * This file is part of QIS Survelliance App.
 *
 *  QIS Survelliance App is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  QIS Survelliance App is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with QIS Survelliance App.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.eyeseetea.malariacare.layout.adapters.general;

import android.content.Context;

import org.eyeseetea.malariacare.database.model.Program;
import org.eyeseetea.malariacare.views.TextCard;

import java.util.List;

/**
 * Created by adrian on 30/04/15.
 */
public class ProgramArrayAdapter extends AddlArrayAdapter<Program> {

    public ProgramArrayAdapter(Context context, List<Program> programs) {
        super(context, programs);
    }

    @Override public void drawText(TextCard textCard, Program program) {
        textCard.setText(program.getName());
    }

}