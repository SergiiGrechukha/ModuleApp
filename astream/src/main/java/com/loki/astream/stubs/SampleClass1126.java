package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1126 {

    @Ignore    private SampleClass1127 sampleClass;

    public SampleClass1126(){
        sampleClass = new SampleClass1127();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}