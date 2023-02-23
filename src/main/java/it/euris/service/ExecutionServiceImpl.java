package it.euris.service;

import java.util.Random;

public class ExecutionServiceImpl implements ExecutionService {
    @Override
    public Integer getPercentage() {
        Random random=new Random();
        return random.nextInt()%100;
    }
}
