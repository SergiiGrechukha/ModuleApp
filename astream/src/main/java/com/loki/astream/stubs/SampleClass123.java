package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass123 {

    @Ignore    private SampleClass124 sampleClass;

    public SampleClass123(){
        sampleClass = new SampleClass124();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}