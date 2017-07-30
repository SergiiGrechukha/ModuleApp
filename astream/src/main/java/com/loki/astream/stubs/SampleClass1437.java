package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1437 {

    @Ignore    private SampleClass1438 sampleClass;

    public SampleClass1437(){
        sampleClass = new SampleClass1438();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}