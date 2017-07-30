package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass78 {

    @Ignore    private SampleClass79 sampleClass;

    public SampleClass78(){
        sampleClass = new SampleClass79();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}