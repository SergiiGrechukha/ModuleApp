package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1551 {

    @Ignore    private SampleClass1552 sampleClass;

    public SampleClass1551(){
        sampleClass = new SampleClass1552();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}