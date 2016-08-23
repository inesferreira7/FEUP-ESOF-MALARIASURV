package org.eyeseetea.malariacare.monitor.rows;

import android.content.Context;

import org.eyeseetea.malariacare.R;
import org.eyeseetea.malariacare.monitor.utils.SurveyMonitor;

/**
 * Created by idelcano on 21/07/2016.
 */
public class CombinedACTRowBuilder  extends CounterRowBuilder {

    public CombinedACTRowBuilder(Context context) {
        super(context, context.getString(R.string.monitor_row_title_combined_act));
    }
    @Override
    protected Integer incrementCount(SurveyMonitor surveyMonitor) {
        return (surveyMonitor.isCombinedACT())?1:0;
    }
}