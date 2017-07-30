package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass646 {

    @Ignore    private SampleClass647 sampleClass;

    public SampleClass646(){
        sampleClass = new SampleClass647();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}