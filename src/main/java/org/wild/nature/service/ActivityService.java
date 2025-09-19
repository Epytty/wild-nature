package org.wild.nature.service;


import org.wild.nature.enums.AnimalActivity;

public interface ActivityService {

    AnimalActivity setRandomActivity(AnimalActivity[] availableActivities);
}
