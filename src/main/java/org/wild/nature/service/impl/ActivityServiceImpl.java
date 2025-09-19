package org.wild.nature.service.impl;


import lombok.RequiredArgsConstructor;
import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.service.ActivityService;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    @Override
    public AnimalActivity setRandomActivity(AnimalActivity[] availableActivities) {
        return availableActivities[new Random().nextInt(availableActivities.length)];
    }

    @Override
    public AnimalActivity getPreviousActivity(List<AnimalActivity> activityHistory) {
        if (!activityHistory.isEmpty()) {
            return activityHistory.get(activityHistory.size() - 1);
        } else {
            return AnimalActivity.NOTHING;
        }
    }
}
