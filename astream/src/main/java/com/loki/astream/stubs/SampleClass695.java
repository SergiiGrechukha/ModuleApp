package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass695 {

    @Ignore    private SampleClass696 sampleClass;

    public SampleClass695(){
        sampleClass = new SampleClass696();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}