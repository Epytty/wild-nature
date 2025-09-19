package org.wild.nature.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.service.ActivityService;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Animal {

    private final String type;
    private volatile AnimalActivity activity;
    protected AnimalActivity[] availableActivities;

    public void updateActivity(ActivityService activityService) {
        this.activity = activityService.setRandomActivity(availableActivities);
    }

    @Override
    public String toString() {
        return type;
    }
}
