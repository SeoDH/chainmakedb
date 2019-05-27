package com.enterblock.chainmakedb.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronTable {

    static final Logger LOG = LoggerFactory.getLogger(CronTable.class);

    // 초 분 시 day month year
    @Scheduled(cron = "0 * * * * *")
    public void jobType1() {
        LOG.debug("jobType1 run!!");
    }

    // application 실행된 후 60초 후에 첫 실행, 5초마다 구동.
    @Scheduled(initialDelay = 60000, fixedDelay = 5000)
    public void jobType2() {
        //Log("Other job");
        LOG.debug("jobType2 run");
    }
}
