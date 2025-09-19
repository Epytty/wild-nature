package org.wild.nature.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.service.ActivityService;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Animal {

    private final String type;
    private volatile AnimalActivity activity;
    protected AnimalActivity[] availableActivities;
    private final List<AnimalActivity> activityHistory = new ArrayList<>();

    public void updateActivity(ActivityService activityService) {
        AnimalActivity newActivity = activityService.setRandomActivity(availableActivities);
        if (this.activity != null && !this.activity.equals(newActivity)) {
            activityHistory.add(this.activity);
        }
        this.activity = newActivity;
    }

    @Override
    public String toString() {
        return type;
    }
}
