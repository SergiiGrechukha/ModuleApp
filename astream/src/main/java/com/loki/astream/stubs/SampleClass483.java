package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass483 {

    @Ignore    private SampleClass484 sampleClass;

    public SampleClass483(){
        sampleClass = new SampleClass484();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}