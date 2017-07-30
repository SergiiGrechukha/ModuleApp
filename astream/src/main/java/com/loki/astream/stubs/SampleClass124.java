package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass124 {

    @Ignore    private SampleClass125 sampleClass;

    public SampleClass124(){
        sampleClass = new SampleClass125();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}