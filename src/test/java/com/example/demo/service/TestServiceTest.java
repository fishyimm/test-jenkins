package com.example.demo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceTest {

    @InjectMocks
    private TestService subject;

    @Test
    public void getTest() {
        Assert.assertEquals("test service", subject.getTest());
    }
}