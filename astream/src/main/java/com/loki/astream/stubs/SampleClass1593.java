package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1593 {

    @Ignore    private SampleClass1594 sampleClass;

    public SampleClass1593(){
        sampleClass = new SampleClass1594();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}