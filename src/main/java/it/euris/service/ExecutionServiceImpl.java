package it.euris.service;

import lombok.Data;

import java.time.LocalDate;
import java.util.Random;
@Data
public class ExecutionServiceImpl implements ExecutionService {

    private Integer executions;
    private Integer seed;
    private LocalDate date;

    public ExecutionServiceImpl() {
        executions=0;
    }
    @Override
    public Integer getPercentage() {
        Random random=new Random(seed);
        return random.nextInt()%100;
    }

    @Override
    public void increment() {
        executions++;
    }
}
