package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1367 {

    @Ignore    private SampleClass1368 sampleClass;

    public SampleClass1367(){
        sampleClass = new SampleClass1368();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}