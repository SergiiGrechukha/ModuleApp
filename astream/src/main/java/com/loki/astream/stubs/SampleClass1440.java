package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1440 {

    @Ignore    private SampleClass1441 sampleClass;

    public SampleClass1440(){
        sampleClass = new SampleClass1441();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}