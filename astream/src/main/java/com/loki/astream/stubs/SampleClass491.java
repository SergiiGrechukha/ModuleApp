package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass491 {

    @Ignore    private SampleClass492 sampleClass;

    public SampleClass491(){
        sampleClass = new SampleClass492();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}