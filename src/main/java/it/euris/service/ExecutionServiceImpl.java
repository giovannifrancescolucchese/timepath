package it.euris.service;

import java.util.Random;

public class ExecutionServiceImpl implements ExecutionService {

    private Integer executions;

    public ExecutionServiceImpl() {
        executions=0;
    }
    @Override
    public Integer getPercentage() {
        Random random=new Random();
        return random.nextInt()%100;
    }

    @Override
    public void increment() {
        executions++;
    }
}
