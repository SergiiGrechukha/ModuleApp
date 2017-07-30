package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass572 {

    @Ignore    private SampleClass573 sampleClass;

    public SampleClass572(){
        sampleClass = new SampleClass573();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}