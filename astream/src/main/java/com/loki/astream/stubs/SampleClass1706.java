package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1706 {

    @Ignore    private SampleClass1707 sampleClass;

    public SampleClass1706(){
        sampleClass = new SampleClass1707();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}