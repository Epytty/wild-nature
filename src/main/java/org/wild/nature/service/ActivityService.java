package org.wild.nature.service;


import org.wild.nature.enums.AnimalActivity;

import java.util.List;

public interface ActivityService {

    AnimalActivity setRandomActivity(AnimalActivity[] availableActivities);
    AnimalActivity getPreviousActivity(List<AnimalActivity> activityHistory);
}
