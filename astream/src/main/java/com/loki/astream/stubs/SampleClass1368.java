package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1368 {

    @Ignore    private SampleClass1369 sampleClass;

    public SampleClass1368(){
        sampleClass = new SampleClass1369();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}